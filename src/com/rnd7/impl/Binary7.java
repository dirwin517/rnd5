
package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;

public class Binary7 extends Rnd5 implements Rnd7 {

	@Override
	public int rnd() {

		int bit1 = rnd5();
		int bit2 = rnd5();
		int bit3 = rnd5();

		return (bit1 % 2 == 0 ? 1 : 0) + (bit2 % 2 == 0 ? 2 : 0) + (bit3 % 2 == 0 ? 4 : 0);
	}

}
