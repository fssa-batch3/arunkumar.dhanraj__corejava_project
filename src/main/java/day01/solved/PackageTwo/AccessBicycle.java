package day01.solved.PackageTwo;

import day01.solved.packageOne.Bicycle;


public class AccessBicycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
//		System.out.println(bike1.gear);
		bike1.getGear();
		
	}

}