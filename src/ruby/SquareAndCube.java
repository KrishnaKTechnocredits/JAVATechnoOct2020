package ruby;

//find the square and cube of a number

class SquareAndCube{
	void square(int num){
		System.out.println(" Square of the number "+ num + " is " + (num * num));
	}
	
	void cube(int num){
		System.out.println(" Cube of the number "+ num + " is " + (num * num * num));
	}

	public static void main(String[] a){
		SquareAndCube squareAndCube = new SquareAndCube();
		squareAndCube.square(2);
		squareAndCube.cube(2);
	}
}
