package technoCredits.loop;

public class Example7 {

	void processData(int number) {
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("GM");
		
		while(number>25) {
			System.out.println("Hi");
			System.out.println("Hello");
			System.out.println("GM");
			number = number - 10;
		}
		
		do{
			System.out.println("Hi");
			System.out.println("Hello");
			System.out.println("GM");
			number = number - 10;
		}while(number>25);
			
//		for(int index=1;number>25;index++) {
//			System.out.println("Hi");
//			System.out.println("Hello");
//			System.out.println("GM");
//			number = number - 10;
//		}
	}
	
	public static void main(String[] args) {
		new Example7().processData(15);
	}
}
