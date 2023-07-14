package day05.solved.packageOne;

public abstract  class Polygon {
	
protected int numberOfSides;
	
	protected Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();

}
