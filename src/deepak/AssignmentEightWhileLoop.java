package deepak;

public class AssignmentEightWhileLoop {
	
	void printEvenNumbers(int start, int end) {
		
		System.out.println("Printing all even numbers in given range: "+ start +" TO "+ end);
		
		while(start <= end) {
			if(start %2==0) {
				System.out.println(start);
			} start++;
		}	
	}
	void printNumbersDivisibleByFive(int start, int end) {
		
		System.out.println("Printing all numbers divisible by five in given range: "+ start +" TO "+ end);
		
		while(start <= end) {
			if(start %5 == 0) {
				System.out.println(start);
			} start++;
		}	
	}
	void printNumbersDivisibleByFiveAndThree(int start, int end) {
		
		System.out.println("Printing all numbers divisible by five and three in given range: "+ start +" TO "+ end);
		
		while(start <= end) {
			if(start %5 ==0 && start %3==0) {
				System.out.println(start);
			} start++;
		}
	}
	void printNumbersDivisibleBySevenOrThirteen(int start, int end) {
		
		System.out.println("Printing all numbers divisible by seven and thirteen in given range: "+ start +" TO "+ end);
		
		while(start <= end) {
			if(start %7 == 0 || start %13 == 0) {
				if(start %7 == 0) {
					System.out.println(start + " is divisible by "+ 7);
				}
				else System.out.println(start + " is divisible by "+ 13);
				
			} start++;
		}
	}
	

	public static void main(String[] args) {
		
		AssignmentEightWhileLoop assignmentEightWhileLoop = new AssignmentEightWhileLoop();
		
		assignmentEightWhileLoop.printEvenNumbers(10,15);
		assignmentEightWhileLoop.printNumbersDivisibleByFive(10,30);
		assignmentEightWhileLoop.printNumbersDivisibleByFiveAndThree(5,18);
		assignmentEightWhileLoop.printNumbersDivisibleBySevenOrThirteen(5,40);

	}

}
