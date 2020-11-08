package vishakha;

public class WhileLoopExample {
	
	void printEvenNos(int startIndex, int endIndex){
		System.out.println("Even Numbers are : ");
		int index=startIndex;
		while(index<=endIndex){
			if (index % 2 == 0) 
				System.out.println(index + " ");
			index++;
		}
	}
	
	void printNoDivisibleBy5And3(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 3 and 5 are : ");
		int index=startIndex;
		while(index<=endIndex){
			if(index % 3 == 0 && index % 5 == 0)
				System.out.println(index+ " ");
			index++;
		}
	}
	
	void printNoDivisibleBy5(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 are : ");
		int index=startIndex;
		while(index<=endIndex){
			if(index % 5 == 0)
				System.out.println(index+ " ");
			index++;
		}
	}
	
	void printNoDivisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 are : ");
		int index=startIndex;
		while(index<=endIndex){
			if(index % 7 == 0)
				System.out.println(index+ " is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index+ " is divisible by 13");
			index++;
		}
	}
	
	public static void main(String[] a){
		WhileLoopExample whileLoopExample = new WhileLoopExample();
		whileLoopExample.printEvenNos(10, 15);
		whileLoopExample.printNoDivisibleBy5And3(5, 18);
		whileLoopExample.printNoDivisibleBy5(10, 30);
		whileLoopExample.printNoDivisibleBy7Or13(5, 40);
	}

}
