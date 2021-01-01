package milind.Assignment39;

import java.util.Scanner;

public class TestSquare extends Square{
	
	static double side;
	
	TestSquare(){
		super(side);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side : " );
		side = scanner.nextDouble();
		TestSquare testSquare = new TestSquare();
		System.out.println("Square is : " + testSquare.square());
		scanner.close();
	}

}
