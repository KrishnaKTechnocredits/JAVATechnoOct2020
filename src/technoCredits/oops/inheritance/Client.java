package technoCredits.oops.inheritance;

public class Client {
	
	
	float f = 10;
	
	static void m1(String msg) {
		System.out.println("Hi");
	}
	
	static void m1(int msg) {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		/*Child child = new Child();
		child.m2();
		System.out.println(child.y);*/
		//int sum = sum + Character.getNumericValue(input.charAt(index));
		int temp = Character.getNumericValue('1') + Character.getNumericValue('2');
		System.out.println("temp is " + temp);
		System.out.println(args[4]);
		String temp1 = "temp,,,,,,, is " + temp;
		m1(temp1);
		
		temp1.substring(0,4);
	}
}
