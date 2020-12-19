package mrunal;

public class squareArea extends testSquare {
	squareArea() {
		super(10);
	}
	public static void main(String[]arg) {
		squareArea testclass = new squareArea();
		System.out.println("Side of Square = " + testclass.side);
		System.out.println("Calulated area = " + testclass.area);

		if(testclass.area == 10*10) {
		System.out.println("Execution Status:- Pass");
		}

		else 
		System.out.println("Execution Status:- Fail");
	}
}