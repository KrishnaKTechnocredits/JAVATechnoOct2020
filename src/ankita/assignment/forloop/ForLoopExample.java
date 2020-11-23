package ankita.assignment.forloop;

public class ForLoopExample {

	void prinEvenNumber(int start,int end) {
		
		System.out.println("Even Numbers between "+ start +"&"+end);
		for(int i=start; i<=end; i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
	}
	void printDivisibleByFive(int start, int end) {
		
		System.out.println("Numbers divisible by 5 in range "+start +"&"+end);
		for(int i=start; i<=end ; i++) {
			if(i%5==0)
				System.out.println(i);
		}
	}
	void printDivisibleByFiveAndThree(int start, int end) {
		System.out.println("Number divisible by 5&3 in range "+ start + "&" + end);
		for(int i=start; i<=end; i++) {
			if( i%5==0 && i%3==0)
				System.out.println(i + " Divisible by 5&3\n");
		}
	}
	void printDivisibleBySevenOrThirteen(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(i%7 == 0 )
				System.out.println(i + " Divisible by 7");
			if(i%13 == 0)
				System.out.println(i + " Divisible by 13");
		}
	}
	public static void main(String[] args) {
		ForLoopExample forLoopExample = new ForLoopExample();
		forLoopExample.prinEvenNumber(10, 15);
		forLoopExample.printDivisibleByFive(10,30);
		forLoopExample.printDivisibleByFiveAndThree(5,18);
		forLoopExample.printDivisibleBySevenOrThirteen(5, 40);
	}
}
