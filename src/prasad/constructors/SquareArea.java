package prasad.constructors;

/*Program : 2 
Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side) */

public class SquareArea {
	int side;
	int area;
	
	 SquareArea(int side){
		this.side = side;
		sqArea();
	}
	
	void sqArea() {
		int area = side*side;
		this.area=area;
	}
	
	public static void main(String[]arg) {
		SquareArea sqr = new SquareArea(9);
		System.out.println("Square side = " + sqr.side + " cms");
		System.out.println("Area of square with sides " + sqr.area+ " sqcm");
	}

}
