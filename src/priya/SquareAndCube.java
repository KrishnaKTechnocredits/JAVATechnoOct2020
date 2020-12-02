package priya;

public class SquareAndCube {

	void calculateSquare(int x) {
		int squareRoot = x*x;
		System.out.println("Square of " + x + " is : " +squareRoot);
	}
	void calculateCube(int x) {
		int cubeRoot = x*x*x;
		System.out.println("Cube of " + x + " is :" +cubeRoot);
	}
	public static void main(String[] args) {
		SquareAndCube squareAndCube = new SquareAndCube();
		squareAndCube.calculateSquare(5);
		squareAndCube.calculateCube(5);
	}
}
