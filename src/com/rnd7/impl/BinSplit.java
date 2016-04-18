package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;

public class BinSplit extends Rnd5  implements Rnd7 {

	@Override
	public int rnd() {

		int init = rnd5();
		
		if(rnd5() % 2 == 0){
			return init + 2;
		}
		return init;
		
	}

}
