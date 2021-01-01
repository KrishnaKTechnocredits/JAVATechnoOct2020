package nagendra.assignment39;

/*
Program : 2 
Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side) 
*/

public class TestSquareClass {

	public static void main(String[] args) {
		Square object = new Square(10);
		object.areaOfSquare();
	}
}
