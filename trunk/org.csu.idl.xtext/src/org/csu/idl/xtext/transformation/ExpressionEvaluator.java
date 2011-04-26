/*
 * ExpressionEvaluator.java
 * Copyright (C) Cátedra SAES-UMU 2010 <catedra-saes-umu@listas.um.es>
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.csu.idl.xtext.transformation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.csu.idl.idlmm.ArrayDef;
import org.csu.idl.idlmm.BinaryExpression;
import org.csu.idl.idlmm.Constant;
import org.csu.idl.idlmm.ConstantDef;
import org.csu.idl.idlmm.ConstantDefRef;
import org.csu.idl.idlmm.EnumMember;
import org.csu.idl.idlmm.Expression;
import org.csu.idl.idlmm.IdlmmFactory;
import org.csu.idl.idlmm.SequenceDef;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.idlmm.UnaryExpression;
import org.csu.idl.idlmm.ValueExpression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;

public class ExpressionEvaluator {
	private static final IdlmmFactory factory = IdlmmFactory.eINSTANCE;
	
	private static final Map<Expression,String> cache = new HashMap<Expression, String>();

	public static void evaluate(TranslationUnit tu) throws ExpressionEvaluationException {
		Set<EObject> arraydefs = EcoreUtil2.findAllByType(EcoreUtil.getAllProperContents(tu, true), ArrayDef.class);

		for (EObject obj : arraydefs) {
			ArrayDef array = (ArrayDef) obj;
			evaluate(array);
		}

		Set<EObject> seqdefs = EcoreUtil2.findAllByType(EcoreUtil.getAllProperContents(tu, true), SequenceDef.class);

		for (EObject obj : seqdefs) {
			SequenceDef seq = (SequenceDef) obj;
			evaluate(seq);
		}

		Set<EObject> constdefs = EcoreUtil2.findAllByType(EcoreUtil.getAllProperContents(tu, true), ConstantDef.class);

		for (EObject obj : constdefs) {
			ConstantDef constd = (ConstantDef) obj;
			evaluate(constd);
		}
		
		// TODO: StringDef & FixedDef
	}

	private static void evaluate(ConstantDef constd) throws ExpressionEvaluationException {
		ValueExpression ve = factory.createValueExpression();
		ve.setValue(evaluate(constd.getConstValue()));
		constd.setConstValue(ve);
	}

	private static void evaluate(ArrayDef array) throws ExpressionEvaluationException {
		EList<Expression> bounds = array.getBounds();
		for (int i = 0; i < bounds.size(); i++) {
			String val = evaluate(bounds.get(i));
			ValueExpression ve = factory.createValueExpression();
			ve.setValue(val);
			bounds.set(i, ve);
		}
	}

	private static void evaluate(SequenceDef seq) throws ExpressionEvaluationException {
		String val = evaluate(seq.getBound());
		if (val != null) {
			ValueExpression ve = factory.createValueExpression();
			ve.setValue(val);
			seq.setBound(ve);
		}
	}

	//

	private static String evaluate(Expression e) throws ExpressionEvaluationException {
	
		if (cache.containsKey(e))
			return cache.get(e);

		String result = null;
		
		if (e instanceof BinaryExpression)
			result = evaluate((BinaryExpression) e);
		else if (e instanceof UnaryExpression)
			result = evaluate((UnaryExpression) e);
		else if (e instanceof ValueExpression)
			result = evaluate((ValueExpression) e);
		else if (e instanceof ConstantDefRef)
			result = evaluate((ConstantDefRef) e);
		
		cache.put(e, result);
		
		return result;
	}

	private static String evaluate(BinaryExpression e) throws ExpressionEvaluationException {
		String op = e.getOperator();

		String val1 = evaluate(e.getLeft());
		String val2 = evaluate(e.getRight());

		if (op.equals("+")) {
			double res = Double.parseDouble(val1) + Double.parseDouble(val2);
			return Double.toString(res);
		} else if (op.equals("-")) {
			double res = Double.parseDouble(val1) - Double.parseDouble(val2);
			return Double.toString(res);
		} else if (op.equals("*")) {
			double res = Double.parseDouble(val1) * Double.parseDouble(val2);
			return Double.toString(res);
		} else if (op.equals(">>")) {
			long f1 = (long) Double.parseDouble(val1);
			long f2 = (long) Double.parseDouble(val2);
			long res = f1 >> f2;
			return Long.toString(res);
		} else if (op.equals("<<")) {
			long f1 = (long) Double.parseDouble(val1);
			long f2 = (long) Double.parseDouble(val2);
			long res = f1 << f2;
			return Long.toString(res);
		} else if (op.equals("%")) {
			long f1 = (long) Double.parseDouble(val1);
			long f2 = (long) Double.parseDouble(val2);
			long res = f1 % f2;
			return Long.toString(res);
		} else if (op.equals("^")) {
			double f1 = Double.parseDouble(val1);
			double f2 = Double.parseDouble(val2);
			double res = Math.pow(f1, f2);
			return Double.toString(res);
		} else if (op.equals("|")) {
			boolean res = str2bool(val1) | str2bool(val2);
			return bool2str(res);
		} else if (op.equals("&")) {
			boolean res = str2bool(val1) & str2bool(val2);
			return bool2str(res);
		}

		throw new ExpressionEvaluationException();
	}

	private static String evaluate(UnaryExpression e) throws ExpressionEvaluationException {
		String op = e.getOperator();

		String val = evaluate(e.getExpression());

		if (op.equals("+")) {
			return val;
		} else if (op.equals("-")) {
			double res = -Double.parseDouble(val);
			return Double.toString(res);
		} else if (op.equals("~")) {
			boolean res = !str2bool(val);
			return bool2str(res);
		}

		throw new ExpressionEvaluationException();
	}

	private static String evaluate(ValueExpression e) {
		return e.getValue();
	}

	/**
	 * Una ConstantDefRef puede ser una referencia a una ConstantRef o a un EnumMember
	 * @param
	 * @return
	 * @throws ExpressionEvaluationException
	 */
	private static String evaluate(ConstantDefRef e) throws ExpressionEvaluationException {
		Constant cons =  e.getConstant();
		
		if (cons instanceof EnumMember)
		{
			// El valor numerico de un EnumMember es el valor de su posicion en
			// la enumeracion
			EnumMember enumm = (EnumMember) cons;
			return Integer.toString(enumm.getEnum().getMembers().indexOf(enumm));
		}
		
		// else: apunta a una ConstantDef
		return evaluate(((ConstantDef)e.getConstant()).getConstValue());

	}

	private static boolean str2bool(String s) throws ExpressionEvaluationException {
		if (s.equals("TRUE"))
			return true;
		else if (s.equals("FALSE"))
			return false;
		
		throw new ExpressionEvaluationException();
	}

	private static String bool2str(boolean b) {
		if (b)
			return "TRUE";
		return "FALSE";
	}

}
