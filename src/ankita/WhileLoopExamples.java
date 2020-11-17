package ankita;

public class WhileLoopExamples {
	void prinEvenNumber(int start,int end) {
		int i=start;
		System.out.println("Even Numbers between "+ start +"&"+end);
		while(i<=end) {
			 if(i%2 == 0)
				System.out.println(i);
			 i++;
		}
	}
	void printDivisibleByFive(int start, int end) {
		int i=start;
		System.out.println("Numbers divisible by 5 in range "+start +"&"+end);
		while(i<=end ) {
			if(i%5==0)
				System.out.println(i);
			i++;
		}
	}
	void printDivisibleByFiveAndThree(int start, int end) {
		int i=start;
		System.out.println("Number divisible by 5&3 in range "+ start + "&" + end);
		while(i<=end) {
			if( i%5==0 && i%3==0)
				System.out.println(i + " Divisible by 5&3\n");
			i++;
		}
	}
	void printDivisibleBySevenOrThirteen(int start, int end) {
		int i=start;
		while(i<=end) {
			if(i%7 == 0 )
				System.out.println(i + " Divisible by 7");
			if(i%13 == 0)
				System.out.println(i + " Divisible by 13");
			i++;
		}
	}
	public static void main(String[] args) {
		WhileLoopExamples whileLoopExample = new WhileLoopExamples();
		whileLoopExample.prinEvenNumber(10, 15);
		whileLoopExample.printDivisibleByFive(10,30);
		whileLoopExample.printDivisibleByFiveAndThree(5,18);
		whileLoopExample.printDivisibleBySevenOrThirteen(5, 40);
	}
}
