package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;

public class MultDiv extends Rnd5  implements Rnd7 {

	@Override
	public int rnd() {
		return ((rnd5() * 7) / 5);
	}

}
