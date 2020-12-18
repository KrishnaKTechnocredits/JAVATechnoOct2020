/*Program : 2 
Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.
NOTE : square method should not take any parameter, constructor should set side value in
instance variable and square method should use that instance variable.
(area=side*side) */
package suvela.assignment39.prog2;

public class Square {
 int side;
  Square(int side){
	  System.out.println("value of a side is:"+side);
	  this.side=side;
  }
  public int areOfSquare() {
	  return  side*side;
  }
}
