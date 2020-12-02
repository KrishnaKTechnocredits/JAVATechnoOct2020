/*	Date - 21-Oct-2020, Day 5
	Java Assignment 3 - Program:1

1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube. */
package nitin;
class SquareCube{
		
	void square(int number){
		int calculate=number*number;
		System.out.println("Square Of Number : "+calculate);
	}
	void cube(int number){
		int calculate=number*number*number;
		System.out.println("Cube Of Number : "+calculate);
	}
	public static void main(String[] a){
		SquareCube squareCube = new SquareCube();
		squareCube.square(5);
		squareCube.cube(3);
	}
}