package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;

public class MultDivCeil extends Rnd5  implements Rnd7 {

	@Override
	public int rnd() {
		return (int)(Math.ceil(rnd5() * 7.0) / 5.0);
	}

}
