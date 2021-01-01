package prasad.constructors;

/*Test class of SquareArea class*/

public class SquareTestClass extends SquareArea {
	
	SquareTestClass(){
		super(10);
	}
	
	public static void main(String[]arg) {
		SquareTestClass testclass = new SquareTestClass();
		System.out.println("Side of Square = " + testclass.side);
		System.out.println("Calulated area = " + testclass.area);
		
		if(testclass.area == 10*10) {
		System.out.println("Execution Status:- Pass");
		}
		
		else 
		System.out.println("Execution Status:- Fail");
	}
}
