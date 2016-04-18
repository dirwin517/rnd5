package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;

public class Sum2Mod extends Rnd5  implements Rnd7 {

	@Override
	public int rnd() {
		return (rnd5() + rnd5()) % 8;
	}

}
