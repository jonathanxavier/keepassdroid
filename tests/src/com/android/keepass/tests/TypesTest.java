/*
 * Copyright 2009 Brian Pellin.
 *     
 * This file is part of KeePassDroid.
 *
 *  KeePassDroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  KeePassDroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with KeePassDroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.android.keepass.tests;

import junit.framework.TestCase;
import org.phoneid.keepassj2me.Types;
import static org.junit.Assert.*;

public class TypesTest extends TestCase {

	public void testReadWriteInt() {
		byte[] orig = new byte[8];
		byte[] dest = new byte[8];
		
		for (int i = 0; i < 4; i++ ) {
			orig[i] = 0;
		}
		
		for (int i = 4; i < 8; i++ ) {
			orig[4] = Byte.MAX_VALUE;

		}
		
		int one = Types.readInt(orig, 0);
		int two = Types.readInt(orig, 4);
		
		Types.writeInt(one, dest, 0);
		Types.writeInt(two, dest, 4);

		assertArrayEquals(orig, dest);
		
	}

	
}
 