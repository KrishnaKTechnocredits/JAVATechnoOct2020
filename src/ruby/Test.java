package ruby;

public class Test {
	
	static void swapNumber(int a, int b){
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println(a + " "+ b);
		 }
		 

	public static void main(String[] args) {
		int a=147, b=340;
		System.out.println("Befor swap "+a +" "+ b );
		Test.swapNumber(a, b);
		/*System.out.println("Welcome to TechnoCredits !!!");
		System.out.println("Welcome to TechnoCredits123 !!!");*/
	}

}
