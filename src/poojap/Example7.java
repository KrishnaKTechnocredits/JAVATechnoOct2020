package poojap;

public class Example7 {
	
	void evenNumber(int start,int end) {
		
		for(int i=start;i<=end;i++) {
			
			if(i%2==0) {
				System.out.println("Even Number is " +i);
			}
		}
	}
	
	void numberDivisibleByFive(int start,int end) {
		
		for(int i=start;i<=end;i++) {
			
			if(i%5==0) {
				
				System.out.println("Number Divisible By Five is " +i);
			}
		}
	}
	void numberDivisibleByfiveandthree(int start,int end){
		
		for(int i=start;i<=end;i++) {
			
			if(i%5==0&&i%3==0) {
				 System.out.println("Number divisible by 5 & 3 is " +i);
			}
		}
	}
	
	void numberDivisibleBy7or13(int start, int end) {
		
		for(int i=start; i<=end;i++) {
			
			if(i%7==0) {
				
				System.out.println("Number Divisible by 7 is " +i );
			}
			if(i%13==0) {
				
				System.out.println("Number Divisible by 13 is " +i);
			}
		}
	}
	public static void main(String[] args) {
		Example7 example7=new Example7();
		example7.evenNumber(10, 15);
		example7.numberDivisibleByFive(10, 30);
		example7.numberDivisibleByfiveandthree(5, 18);
		example7.numberDivisibleBy7or13(5, 40);
		

	}

}
