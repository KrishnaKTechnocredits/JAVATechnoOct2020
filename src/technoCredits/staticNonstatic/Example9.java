package technoCredits.staticNonstatic;

public class Example9 {

	static int number = 10;
	
	static void m1() {
		int x = 20;
	}
	
	void m2() {
		for(int index=0;index<5;index=index+2) {
			System.out.println(index);
		}
		int number1 = 20;
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
	}
}
