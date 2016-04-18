package com.rnd7.api;

import java.util.Random;

public class Rnd5 {

	Random rnd = new Random();
	
	protected int rnd5(){
		return rnd.nextInt(6);
	}
}
