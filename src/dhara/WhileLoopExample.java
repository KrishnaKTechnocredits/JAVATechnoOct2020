package dhara;

public class WhileLoopExample {
	
	void displayNumbers1(int start, int end) {
		System.out.println("Even Numbers are: ");
		int i=start;
		while(i<=end){
			if(i%2==0) 
				System.out.println(i);
			i++;
		}
	}

	void displayNumbers2(int start, int end) {
		System.out.println("Divisable by 5, Numbers are: ");
		int i=start;
		while(i<=end) {
			if(i%5==0)
				System.out.println(i);
			i++;
		}
	}

	void displayNumbers3(int start, int end) {
		System.out.println("Divisable by 5 & 3, Numbers are: ");
		int i=start;
		while(i<=end) {
			if(i%5==0 && i%3==0)
				System.out.println(i);
			i++;
		}
	}

	void displayNumbers4(int start, int end) {
		System.out.println("Divisable by 7 & 13, Numbers are: ");
		int i=start;
		while(i<=end) {
			if(i%7==0)
				System.out.println(i +" is divisible by 7");
			else if(i%13==0)
				System.out.println(i +" is divisible by 13");
			i++;
		}	

	}

	public static void main(String[] args) {
		WhileLoopExample whileLoopExample=new WhileLoopExample();
		whileLoopExample.displayNumbers1(10, 15);
		whileLoopExample.displayNumbers2(10, 30);
		whileLoopExample.displayNumbers3(5, 18);
		whileLoopExample.displayNumbers4(5, 40);

	}
}
