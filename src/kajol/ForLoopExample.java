package kajol;

public class ForLoopExample {
	
	void printEvenNumbers(int start, int end) {
		System.out.println("Even Numbers between "+start+" and "+end+" :");
		for(int index=start;index<=end;index++) {
			if(index%2==0)
					System.out.println(index);
		}
			
	}
	
	void printNumbersDivisibleBy5(int start, int end) {
		System.out.println("Numbers divisible by Five between "+start+" and "+end+" :");
		for(int index=start;index<=end;index++) {
			if(index%5==0)
					System.out.println(index);
		}
			
	}
	
	void printNumbersDivisibleBy5and3(int start, int end) {
		System.out.println("Numbers divisible by Five and Three between "+start+" and "+end+" :");
		for(int index=start;index<=end;index++) {
			if(index%5==0 && index%3==0)
					System.out.println(index);
		}
			
	}
	
	void printNumbersDivisibleBy7or13(int start, int end) {
		System.out.println("Numbers divisible by Seven or Thirteen between "+start+" and "+end+" :");
		for(int index=start;index<=end;index++) {
			
			if(index%7==0 || index%13==0)
				if(index%7==0)
					System.out.println(index+" is divisible by 7.");
				if(index%13==0)
					System.out.println(index+" is divisible by 13.");
		}
			
	}
	
	public static void main(String[] args) {
		ForLoopExample forLoopExample=new ForLoopExample();
		forLoopExample.printEvenNumbers(10,15);
		forLoopExample.printNumbersDivisibleBy5(10,30);
		forLoopExample.printNumbersDivisibleBy5and3(5, 18);
		forLoopExample.printNumbersDivisibleBy7or13(5,40);
	}
}
