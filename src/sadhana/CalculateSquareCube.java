package sadhana;

class CalculateSquareCube {

	void calSquare(int a) {
		int result = a * a;
		System.out.println(+result);
	}

	void calCube(int b) {
		int result = b * b * b;
		System.out.println(+result);
	}

	public static void main(String[] args) {
		CalculateSquareCube calculateSquareCube = new CalculateSquareCube();
		System.out.println("Square of entered number is:");
		calculateSquareCube.calSquare(125);
		System.out.println("Cube of entered number is:");
		calculateSquareCube.calCube(34);
	}
}
