package com.rnd7.impl;

import com.rnd7.api.Rnd5;
import com.rnd7.api.Rnd7;


public class Bubble extends Rnd5  implements Rnd7 {

	@Override
	public int rnd() {
			int a = rnd5();
			int b = rnd5();

			while(b >= 3) { 
			  b = rnd5();
			}
			return a + b;
	}

}
