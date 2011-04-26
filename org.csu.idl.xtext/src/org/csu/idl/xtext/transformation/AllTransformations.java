/*
 * AllTransformations.java
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

import org.csu.idl.idlmm.TranslationUnit;

public class AllTransformations {
	public static void apply(TranslationUnit tu) throws ExpressionEvaluationException
	{
		ArrayExpander.expand(tu);
		ExpressionEvaluator.evaluate(tu);
		Include2TranslationUnit.convertInclude2TranslationUnit(tu);
	}
}
