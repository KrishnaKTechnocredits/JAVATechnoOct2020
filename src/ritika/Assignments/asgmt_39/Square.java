package ritika.Assignments.asgmt_39;

/*Program : 2
Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side)
*/
public class Square {

	double side;

	Square(double side) {
		this.side = side;
	}

	void findSquareArea() {
		System.out.println("Given value of side is: " + side + " meters");
		double area = side * side;
		System.out.println("Area of square for given side value is: " + area + " metersqr");
	}
}
