package day04.practice;

class Shape {

	protected int length;
	protected int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public Shape() {
//		Default
	}

//	Constructor
	public Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}


//	Calculate
	public int calculateArea() {

		return getLength() * getBreadth();

	}

}

class Square extends Shape {

	public Square(int a) {
		super(a,a);
	}

}

public class Rectangle {
	public static void main(String[] args) {
		Square area = new Square(5);
		System.out.println("The length of the Square is "+area.getLength());
		System.out.println("The Area of the Square is " + area.calculateArea());
		
		
	}
}
