package poojap;

public class Assignment8 {
	
void evenNumber(int start,int end) {
		
		int i=start;
		while(i<=end) {
			
			if(i%2==0) {
				System.out.println("Even Number is " +i);
			}
			i++;
		}
	}
	
	void numberDivisibleByFive(int start,int end) {
		
		int i=start;
		while(i<=end) {
			
			if(i%5==0) {
				
				System.out.println("Number Divisible By Five is " +i);
			}
			i++;
		}
	}
	void numberDivisibleByfiveandthree(int start,int end){
		
		int i=start;
		while(i<=end) {
			
			if(i%5==0&&i%3==0) {
				 System.out.println("Number divisible by 5 & 3 is " +i);
			}
			i++;
		}
	}
	
	void numberDivisibleBy7or13(int start, int end) {
		
		int i=start;
		while( i<=end) {
			
			if(i%7==0) {
				
				System.out.println("Number Divisible by 7 is " +i );
			}
			if(i%13==0) {
				
				System.out.println("Number Divisible by 13 is " +i);
			}
			i++;
		}
	}
	public static void main(String[] args) {
		
		Assignment8 assignment8=new Assignment8();
		assignment8.evenNumber(10, 15);
		assignment8.numberDivisibleByFive(10, 30);
		assignment8.numberDivisibleByfiveandthree(5, 18);
		assignment8.numberDivisibleBy7or13(5, 40);
		}
}
