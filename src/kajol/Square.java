/*Program : 2 
Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side) 
*/

package kajol;
public class Square {
	
	int side;
	
	Square(int side) {
		this.side=side;
	}

	int areaOfSquare() {
		return side*side;
	}
}
