/*
 * Preprocessor.java
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

package org.csu.idl.preprocessor;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;

import org.anarres.cpp.Feature;
import org.anarres.cpp.FileLexerSource;
import org.anarres.cpp.LexerException;
import org.anarres.cpp.Token;
import org.anarres.cpp.Warning;
import org.apache.log4j.Logger;

public class Preprocessor {

	private Logger logger = Logger.getLogger(Preprocessor.class);

	private org.anarres.cpp.Preprocessor pp = new org.anarres.cpp.Preprocessor();

	private PreprocessorListener pl = new PreprocessorListener();

	public Preprocessor() {
		pp.addFeature(Feature.DIGRAPHS);
		pp.addFeature(Feature.TRIGRAPHS);
		pp.addFeature(Feature.LINEMARKERS);
		pp.addWarning(Warning.IMPORT);
		pp.setListener(pl);
	}

	public void run(String file) {
		try {
			pp.addInput(new FileLexerSource(new File(file)));

			for (;;) {
				Token tok = pp.token();
				if (tok == null)
					break;
				if (tok.getType() == Token.EOF)
					break;

				if (Token.getTokenName(tok.getType()).equals("{"))
					pl.incLevel();
				else if (Token.getTokenName(tok.getType()).equals("}"))
					pl.decLevel();

				if (tok.getType() != Token.P_LINE)
					pl.getCurrent().write(tok.getText().getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
			logger.error("Preprocessor error.");
			// System.exit(1);
		}

		// pl.print();
	}

	public List<ByteArrayOutputStream> getResources() {
		return pl.getByteArrays();
	}

	//
	// Options
	//
	public void addMacroDefinition(String macro) {
		try {
			// TODO: support -Dname=valor=mas=valor
			String def[] = macro.split("=");

			if (def.length == 1)
				pp.addMacro(def[0]);
			else
				pp.addMacro(def[0], def[1]);

		} catch (LexerException e) {
			// e.printStackTrace(System.err);
			logger.error("Preprocessor error.");
			System.exit(1);
		}
	}

	public void undefMacro(String macro) {
		pp.getMacros().remove(macro);
	}

	public void addIncludePath(String path) {
		pp.getSystemIncludePath().add(path);
	}
}
