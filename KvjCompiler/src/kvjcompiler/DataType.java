/*
 *  KvJ Compiler for XML WZ data files
 *  Copyright (C) 2010  GoldenKevin
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package kvjcompiler;

public enum DataType {
	IMGDIR,
	CANVAS,
	UNKNOWN;
	
	public boolean isDirectory() {
		return (this == IMGDIR || this == CANVAS);
	}
	
	public static DataType getFromString(String s) {
		if (s.equals("imgdir"))
			return IMGDIR;
		else if (s.equals("canvas"))
			return CANVAS;
		return UNKNOWN;
	}
}