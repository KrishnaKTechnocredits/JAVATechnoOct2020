package dhara;

public class ForloopExample {

	void displayNumbers1(int start, int end) {
		System.out.println("Even Numbers are: ");
		for(int i=start;i<=end;i++) {
			if(i%2==0) 
				System.out.println(i);
		}
	}
	
	void displayNumbers2(int start, int end) {
		System.out.println("Divisable by 5, Numbers are: ");
		for(int i=start;i<=end;i++) {
			if(i%5==0)
				System.out.println(i);
		}
	}
	
	void displayNumbers3(int start, int end) {
		System.out.println("Divisable by 5 & 3, Numbers are: ");
		for(int i=start;i<=end;i++) {
			if(i%5==0 && i%3==0)
				System.out.println(i);
		}
	}
	
	void displayNumbers4(int start, int end) {
		System.out.println("Divisable by 7 & 13, Numbers are: ");
		for(int i=start;i<=end;i++) {
			if(i%7==0)
				System.out.println(i +" is divisible by 7");
			else if(i%13==0)
				System.out.println(i +" is divisible by 13");
		}	
		
	}
	
	public static void main(String[] args) {
		ForloopExample forloopExample=new ForloopExample();
		forloopExample.displayNumbers1(10, 15);
		forloopExample.displayNumbers2(10, 30);
		forloopExample.displayNumbers3(5, 18);
		forloopExample.displayNumbers4(5, 40);
		
	}
	
}
