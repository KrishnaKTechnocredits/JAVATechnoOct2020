package vaibhav;

public class MathematicalOperation {
	
	void displayEvenNumbers(int start,int end) {
		for(int i = start;i<= end;i++) {
			if(i % 2 == 0)
				System.out.println("Even numbers from given list is "+i);
			}
		}
	
	void displayNoDivisibleByFive(int start,int end) {
		for(int i = start;i <= end; i++) {
			if(i % 5 == 0) 
				System.out.println("Number divisible by 5 in given list is "+i);
		}		
	}
	
	void displayNoDivisibleByFiveAndThree(int start,int end) {
		for(int i = start;i <= end; i++) {
			if(i % 5 == 0 && i % 3 == 0) 
				System.out.println("Number divisible by 5 and 3 in given list is "+i);
		}
	}
	
	void displayNoDivisibleBySevenAndThirteen(int start,int end) {
		for(int i = start;i <= end; i++) {
			if(i % 7 == 0) 
				System.out.println("Number divisible by 7 is "+i);
			else if(i % 13 == 0)
				System.out.println("Number divisible by 13 is "+i);
		}
		
	}

	public static void main(String[] args) {
		MathematicalOperation mathematicalOperation = new MathematicalOperation();
		mathematicalOperation.displayEvenNumbers(90,100);
		mathematicalOperation.displayNoDivisibleByFive(90,100);
		mathematicalOperation.displayNoDivisibleByFiveAndThree(90,100);
		mathematicalOperation.displayNoDivisibleBySevenAndThirteen(5,40);
	}
	

}
