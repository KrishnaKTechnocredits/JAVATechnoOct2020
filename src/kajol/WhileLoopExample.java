package kajol;

public class WhileLoopExample {
	
	void printEvenNumbers(int start, int end) {
		System.out.println("Even Numbers between "+start+" and "+end+" :");
		int index=start;
		while(index<=end) {
			if(index%2==0)
					System.out.println(index);
			index++;
		}
			
	}
	
	void printNumbersDivisibleBy5(int start, int end) {
		System.out.println("Numbers divisible by Five between "+start+" and "+end+" :");
		int index=start;
		while(index<=end) {
			if(index%5==0)
					System.out.println(index);
			index++;
		}
			
	}
	
	void printNumbersDivisibleBy5and3(int start, int end) {
		System.out.println("Numbers divisible by Five and Three between "+start+" and "+end+" :");
		int index=start;
		while(index<=end) {
			if(index%5==0 && index%3==0)
					System.out.println(index);
			index++;
		}
			
	}
	
	void printNumbersDivisibleBy7or13(int start, int end) {
		System.out.println("Numbers divisible by Seven or Thirteen between "+start+" and "+end+" :");
		int index=start;
		while(index<=end) {
			
			if(index%7==0 || index%13==0) 
				if(index%7==0)
					System.out.println(index+" is divisible by 7.");
				if(index%13==0)
					System.out.println(index+" is divisible by 13.");
			index++;
		}
			
	}
	
	public static void main(String[] args) {
		WhileLoopExample whileLoopExample=new WhileLoopExample();
		whileLoopExample.printEvenNumbers(10,15);
		whileLoopExample.printNumbersDivisibleBy5(10,30);
		whileLoopExample.printNumbersDivisibleBy5and3(5, 18);
		whileLoopExample.printNumbersDivisibleBy7or13(5,40);
	}
}



