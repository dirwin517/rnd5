package com.rnd7.test;

import com.rnd7.api.Rnd7;
import com.rnd7.impl.*;
public class TestHarness {

	
	private static final int TEST_COUNT = 1000;
	private static final int HISTOGRAM_SIZE = 8;


	public static void test(Rnd7 impl){
		int histogram[] = new int[HISTOGRAM_SIZE];
		
		for(int i = 0; i < TEST_COUNT; ++i){
			histogram[impl.rnd()]++;
		}
		System.out.println("");
		System.out.println("================================================");
		System.out.println("Histogram For : " + impl.getClass().getName().replace("com.rnd7.impl.", "").toUpperCase());
		for(int i = 0 ; i < HISTOGRAM_SIZE; ++i){
			System.out.println(i + "\t : "  + histogram[i]);
		}
		System.out.println("");
		
	}
	
	
	public static void main(String args[]){
		test(new Binary7());
		test(new BinSplit());
		test(new Bubble());
		test(new MultDivCeil());
		test(new MultDivFloor());
		test(new MultDiv());
		test(new Sum2Mod());
		test(new Sum7Div5());
		test(new Sum7Mod8());
	}
}
