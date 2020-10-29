package vishakha;

public class ForLoopExample {
	
	void printEvenNos(int startIndex, int endIndex){
		System.out.println("Even Numbers are : ");
		for(int index=startIndex;index<=endIndex;index++){
			if (index % 2 == 0) 
				System.out.println(index + " ");
		}
	}
	
	void printNoDivisibleBy5And3(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 3 and 5 are : ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index % 3 == 0 && index % 5 == 0)
				System.out.println(index+ " ");
		}
	}
	
	void printNoDivisibleBy5(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 are : ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index % 5 == 0)
				System.out.println(index+ " ");
		}
	}
	
	void printNoDivisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 are : ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index % 7 == 0)
				System.out.println(index+ " is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index+ " is divisible by 13");
		}
	}
	
	public static void main(String[] a){
		ForLoopExample forLoopExample = new ForLoopExample();
		forLoopExample.printEvenNos(10, 15);
		forLoopExample.printNoDivisibleBy5And3(5, 18);
		forLoopExample.printNoDivisibleBy5(10, 30);
		forLoopExample.printNoDivisibleBy7Or13(5, 40);
	}

}
