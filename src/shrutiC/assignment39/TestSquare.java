package shrutiC.assignment39;

public class TestSquare extends Square {

	TestSquare(double side) {
		super(side);
	}

	public static void main(String[] args) {
		double side = 4.5;
		Square cls = new TestSquare(side);
		System.out.println("Find area of square with side " + side);
		System.out.println("Area : " + cls.getArea());

	}

}
