package rohan.Assignment39;

/*
 * Assignment 39 : Program2 continued...
 */

public class TestSquareClass extends Square{
	
	public TestSquareClass(int side) {
		// TODO Auto-generated constructor stub
		super(side);
	}
	
	public static void main(String[] args) {
		TestSquareClass test1 = new TestSquareClass(4);
		TestSquareClass test2 = new TestSquareClass(6);
		TestSquareClass test3 = new TestSquareClass(8);
	}
}
