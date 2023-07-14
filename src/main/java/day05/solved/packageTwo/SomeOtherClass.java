package day05.solved.packageTwo;

import day05.solved.packageOne.*;

public class SomeOtherClass {
	public static void main(String[] args) {
		try {
		
		Rectangle rectangle = new Rectangle(1.0, 1.0);
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.getNumberOfSides());
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
