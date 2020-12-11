package vaibhav;

public class MathematicalOperationWhileLoop {
	
	void displayEvenNumbers(int start,int end) {
		int i=start;
		while(i<= end) {
			if(i % 2 == 0)
				System.out.println("Even numbers from given list is "+i);
			i++;
			}
		}
	
	void displayNoDivisibleByFive(int start,int end) {
		int i=start;
		while(i <= end) {
			if(i % 5 == 0) 
				System.out.println("Number divisible by 5 in given list is "+i);
			i++;
		}		
	}
	
	void displayNoDivisibleByFiveAndThree(int start,int end) {
		int i = start;
		while(i <= end) {
			if(i % 5 == 0 && i % 3 == 0) 
				System.out.println("Number divisible by 5 and 3 in given list is "+i);
			i++;
		}
	}
	
	void displayNoDivisibleBySevenOrThirteen(int start,int end) {
		int i=start;
		while(i <= end) {
				if(i % 7 == 0 ) 
					System.out.println("Number divisible by 7 is "+i);
				else if (i % 13 == 0)
					System.out.println("Number divisible by 13 is "+i);
				i++;
			}
		}
		
	public static void main(String[] args) {
		MathematicalOperationWhileLoop mathematicalOperationWhileLoop = new MathematicalOperationWhileLoop();
		mathematicalOperationWhileLoop.displayEvenNumbers(90,100);
		mathematicalOperationWhileLoop.displayNoDivisibleByFive(90,100);
		mathematicalOperationWhileLoop.displayNoDivisibleByFiveAndThree(90,110);
		mathematicalOperationWhileLoop.displayNoDivisibleBySevenOrThirteen(5,40);
	}
	

}
