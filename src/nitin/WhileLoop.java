package nitin;

public class WhileLoop {
	
	void evenNumber(int start,int end) {
		int index = start;
		System.out.println("Even numbers are : ");
		while(index<=end) {
			if(index%2==0) {
				System.out.println(index);
			}
			index++;
		}
	}
	void divisibleByFiveNThree(int start,int end) {
		int index=start;
		System.out.println("Divisible by 5 & 3, numbers are : ");
		while(index<=end) {
			if(index%5==0 && index%3==0) {
				System.out.println(index);
			}
			index++;
		}
	}
	void divisibleByFive(int start, int end) {
		int index=start;
		System.out.println("Divisible by 5, numbers are : ");
		while(index<=end) {
			if(index%5==0) {
				System.out.println(index);
			}
			index++;
		}
	}
	void divisibleBySevenNThirteen(int start,int end) {
		int index=start;
		System.out.println("Divisible by 7 or 13, numbers are : ");
		while(index<=end) {
			if(index%7==0) {
				System.out.println(index+" is divisible by 7");
			}else if(index%13==0) {
				System.out.println(index+" is divisible by 13");
				}
			index++;
			}
		}
	
	public static void main(String[] args) {
		WhileLoop whileLoop=new WhileLoop();
		whileLoop.evenNumber(10, 15);
		whileLoop.divisibleByFiveNThree(5,18);
		whileLoop.divisibleByFive(10,30);
		whileLoop.divisibleBySevenNThirteen(5,40);
	}
}
