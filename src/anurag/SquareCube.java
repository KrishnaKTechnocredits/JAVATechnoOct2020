package anurag;

public class SquareCube {

	// float ans;

	void displaySquare(float num1) {
		float ans1 = num1 * num1;
		System.out.println("Square of number is : " + ans1);
	}

	void displayCube(float num2) {
		float ans2 = num2 * num2 * num2;
		System.out.println("Cube of number is : " + ans2);
	}

	public static void main(String[] args) {
		SquareCube squareCube1 = new SquareCube();
		squareCube1.displaySquare(5f);
		squareCube1.displayCube(2f);
		squareCube1.displaySquare(2.5f);
		squareCube1.displayCube(5.5f);
	}

}
