package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;

public class Sum7Mod8 extends Rnd5  implements Rnd7 {

	@Override
	public int rnd() {
		int sum = 0;
		for(int i = 0 ; i < 7; ++i){
			sum += rnd5();
		}
		
		return sum % 8;
	}

}
