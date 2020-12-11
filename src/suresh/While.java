package suresh;

public class While {

	void Even(int start, int end) {
		System.out.println( "Even Numbers are:" );
		int Index =start;
		while (Index<=end) {
			
			if (Index % 2 == 0) {
				
				System.out.println(Index);
				Index++;
		}
		}
		
	}
	
	void Divisible(int start, int end) {
		System.out.println( "Numbers divisble by 5:" );
		int Index =start;
		while (Index<=end) {
			
			if (Index % 5 == 0) {
				
				System.out.println(Index);
				Index++;
		}
		}
		
	} 
	void Odd(int start, int end) {
		System.out.println( "Numbers divisble by 3 & 5:" );
		int Index =start;
		while (Index<=end) {
			
			if (Index % 3 == 0 && Index % 5 == 0) {
				
				System.out.println(Index);
				Index++;
		}
		}
		
	} 
	void RangeDivisible(int start, int end) {
		System.out.println( "Numbers divisble by 7 & 13:" );
		int Index =start;
		while (Index<=end) {
			
			if (Index % 7 ==0  ) {
				
				System.out.println(Index +" is Divisible by 7");
				Index++;
				
		}}
		int Index1 =start;
			while (Index1<=end) {
				
				if (Index1 % 13 ==0  ) {
					
					System.out.println(Index1 +" is Divisible by 13");
					Index1++;
		}}
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forLoop loop = new forLoop();
		loop.Even(10, 15);
		loop.Divisible(10, 30);
		loop.Odd(5, 18);
		loop.RangeDivisible(5, 40);
	}

}
