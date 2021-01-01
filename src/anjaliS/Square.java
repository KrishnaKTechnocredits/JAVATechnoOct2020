package anjaliS;

public class Square {
	int side;

	Square(int side) {
		this.side = side;
		System.out.println("Side of square is : " + side);
	}

	void areaOfSquare() {
		int area = side * side;
		System.out.println("Area of square with given side is : " + area);

	}

}
