package com.nju.dp;

public class StrategyTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog[] DogGroup = new Dog[]{new Dog(4), new Dog(3), new Dog(6)};
		DataSortor.sort(DogGroup);
		DataSortor.p(DogGroup);
	}

}
