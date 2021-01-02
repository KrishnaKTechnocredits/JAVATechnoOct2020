package suresh;
/*Create a Square class with field side, 
one parameterized constructor which accept side value .
Write a method to find the area of a square. 
Write a TestSquareClass to verify Square class
functionality.
NOTE : squaremethod should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side) */
public class Square {
	static double side = 4.5;
	
	/*Square(double side) {
		//side = 4.5;
	}*/
	void AreaSquare(double side) {
		double area = side*side; 
	       System.out.println("Area of Square is: "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.AreaSquare(side);
	}

}
