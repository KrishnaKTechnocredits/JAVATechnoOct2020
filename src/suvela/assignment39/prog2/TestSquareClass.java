package suvela.assignment39.prog2;

public class TestSquareClass extends Square {
	public TestSquareClass() {
		super(10);
		int area=super.areOfSquare();
		System.out.println("Area of square:"+area);
	}
	public static void main(String[] args) {
		new TestSquareClass();
		

	}

}
