/*
 * PreprocessorListener.java
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
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.anarres.cpp.Source;

public class PreprocessorListener extends org.anarres.cpp.PreprocessorListener {

	private LinkedList<ByteArrayOutputStream> stack = new LinkedList<ByteArrayOutputStream>();

	private LinkedList<ByteArrayOutputStream> loaded = new LinkedList<ByteArrayOutputStream>();

	private LinkedList<Integer> levelStack = new LinkedList<Integer>();

	private int level = 0;

	public PreprocessorListener() {
	}

	public void handleSourceChange(Source source, String event) {
		// System.out.println(source + " event: " + event);

		if (level == 0) {
			if (event == "push") {
				if (!stack.isEmpty()) {
					String include = "\n#include \"" + source.toString().replaceFirst("file ", "") + "\"\n";
					try {
						stack.getLast().write(include.getBytes());
					} catch (IOException e) {
						// TODO
						e.printStackTrace();
					}
				}

				ByteArrayOutputStream out = new ByteArrayOutputStream();
				// map.put(source, out);
				stack.addLast(out);
				loaded.addLast(out);

				levelStack.addLast(new Integer(level));
			} else if (event == "pop") {
				stack.pollLast();
				level = levelStack.getLast();
				levelStack.pollLast();
			} // else: resume, suspend
		} // else: preproccessor includes
	}

	public ByteArrayOutputStream getCurrent() {
		return stack.getLast();
	}

	public void print() {
		for (ByteArrayOutputStream out : loaded) {
			System.out.println("-----------------");
			System.out.println(out.toString());
		}
	}

	public List<ByteArrayOutputStream> getByteArrays() {
		return loaded;
	}

	public void incLevel() {
		++level;
	}

	public void decLevel() {
		--level;
	}
}
