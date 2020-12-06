package priyanka;

public class SquareAndCube {

	void square(int num) {
		// square = num*num;
		System.out.println("Square of " + num + " " + "is : " + (num * num));
	}

	void cube(int num) {
		// cube = num*num1*num1;
		System.out.println("Cube of " + num + " " + "is : " + (num * num * num));
	}

	public static void main(String[] args) {
		SquareAndCube squareAndCube = new SquareAndCube();
		squareAndCube.square(8);
		squareAndCube.cube(8);
	}
}
