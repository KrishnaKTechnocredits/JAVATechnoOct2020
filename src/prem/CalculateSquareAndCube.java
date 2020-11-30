package prem;

//Java Assignment: 3  21st Oct 2020
//1. WAP to find the square and cube of a number. 
//NOTE : one method to calculate square and another for cube.

public class CalculateSquareAndCube {

	void square(int num){
		
		int calculate=num*num;
		
		System.out.println("Square Of Number : "+calculate);
	}
	
	void cube(int num){
		
		int calculate=num*num*num;
		
		System.out.println("Cube Of Number : "+calculate);
	}
	
	public static void main(String[] args){
		
		CalculateSquareAndCube calculateSquareAndCube = new CalculateSquareAndCube();
		
		calculateSquareAndCube.square(10);
		
		calculateSquareAndCube.cube(9);
	}
}