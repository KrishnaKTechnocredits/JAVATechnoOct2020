package poojap;

public class SqureandCube {
	
	void squareOfNumber(int num) {
		int square = num*num;
		System.out.println("Square of Number is " +square);
	}
	
	void cubeOfNumber(int num) {
		int cube = num*num*num;
		System.out.println("cube of Number is " +cube);
	}
	
	public static void main(String[] args) {
		
		SqureandCube squreandCube =new SqureandCube();
		 squreandCube.squareOfNumber(6);
		 squreandCube.cubeOfNumber(5);
	}
}
