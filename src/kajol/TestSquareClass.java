/*Program : 2 
Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side) 
*/
package kajol;

import java.util.Scanner;

public class TestSquareClass {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Side of Square to find the Area of: ");
		int side=sc.nextInt();
		Square square=new Square(side); //OR Square square=new Square(sc.nextInt());
		System.out.println("Area of Square with Side "+side+"cm : "+square.areaOfSquare()+" sq.cm .");
		sc.close();
	}
}
