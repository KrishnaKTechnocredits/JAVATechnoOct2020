package ankita.practise;

public class Factorial {
	
	void findFactorial(int number) {
		int factorial=1;
		if(number == 0)
			System.out.println("factorial of Zero : " + number);
		else {
			for(int i=1; i<=number;i++) {
				factorial = factorial *i;
			}	
			System.out.println("factorial of Number "+number +":"+ factorial);
		}
	}
	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		factorial.findFactorial(0);
		factorial.findFactorial(1);
		factorial.findFactorial(8);
	}
}
