package deepak;

public class AssignmentSeven {
	
	void evenNumbers(int start, int end) {
		System.out.println("Printing Even numbers in given range"+" "+ start +" "+ "TO"+" "+ end);
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	void numbersDivisibleByFive(int start, int end) {	
		System.out.println("Printing numbers divisible by five only in given range"+" "+ start +" "+ "TO"+" "+ end);
		for(int i=start; i<=end; i++) {	
			if(i%5==0) {	
				System.out.println(i);
			}
		}
	}
	
	void numbersDivisibleByFiveAndThree(int start, int end) {
		System.out.println("Printing numbers divisible by five and three in given range"+" "+ start +" "+ "TO"+" "+ end);
		for(int i=start; i<=end; i++) {
			if(i%5==0 && i%3==0) {	
				System.out.println(i);
			}
		}	
	}
	
	void numbersDivisibleBySevernOrThirteen(int start, int end) {
		System.out.println("Printing numbers divisible by seven OR thirteen in given range"+" "+ start +" "+ "TO"+" "+ end);
		for(int i=start; i<=end; i++) {
			if(i%7==0 || i%13==0) {	
				if(i%7==0) {	
					System.out.println(i +" Is divisible by"+" "+ 7);	
				}
				else {	
					System.out.println(i +" Is divisible by"+" "+ 13);
				}
			}
		}	
	}

	public static void main(String[] args) {
		
		AssignmentSeven assignmentSeven = new AssignmentSeven();
		
		assignmentSeven.evenNumbers(10,15);
		assignmentSeven.numbersDivisibleByFive(10,30);
		assignmentSeven.numbersDivisibleByFiveAndThree(5, 18);
		assignmentSeven.numbersDivisibleBySevernOrThirteen(5,40);
	}

}
