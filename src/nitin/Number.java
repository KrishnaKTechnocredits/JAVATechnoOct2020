package nitin;

public class Number {
	
	void evenNumber(int start, int end) {
		System.out.println("Even numbers are :");
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	void divisibleByThreeNFive(int start, int end) {
		System.out.println("Divisible by 5 & 3, numbers are : ");
		for(int i=start;i<=end;i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}
	void divisibleByFive(int start, int end) {
		System.out.println("Divisible by 5, numbers are :");
		for(int i=start;i<=end;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
	void divisibleBySevenNThirteen(int start, int end) {
		System.out.println("Divisible by 7 or 13, numbers are :");
		for(int i=start;i<=end;i++) {
			if (i % 7 == 0) {
				System.out.println(+i + " is divisible by 7");
			} else if (i % 13 == 0) {
				System.out.println(+i + " is divisible by 13");
			}
		}		
	}
	public static void main(String[] args) {
		Number number = new Number();
		number.evenNumber(10,15);
		number.divisibleByThreeNFive(5,18);
		number.divisibleByFive(10,30);
		number.divisibleBySevenNThirteen(5,40);
	}
}
