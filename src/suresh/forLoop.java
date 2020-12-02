package suresh;

public class forLoop {
	void Even(int start, int end) {
		System.out.println( "Even Numbers are:" );
		
		for (int Index =start;Index<=end;Index++) {
			
			if (Index % 2 == 0) {
				
				System.out.println(Index);
		}
		}
		
	}
	
	void Divisible(int start, int end) {
		System.out.println( "Numbers divisble by 5:" );
		
		for (int Index =start;Index<=end;Index++) {
			
			if (Index % 5 == 0) {
				
				System.out.println(Index);
		}
		}
		
	} 
	void Odd(int start, int end) {
		System.out.println( "Numbers divisble by 3 & 5:" );
		
		for (int Index =start;Index<=end;Index++) {
			
			if (Index % 3 == 0 && Index % 5 == 0) {
				
				System.out.println(Index);
		}
		}
		
	} 
	void RangeDivisible(int start, int end) {
		System.out.println( "Numbers divisble by 7 & 13:" );
		
		for (int Index =start;Index<=end;Index++) {
			
			if (Index % 7 ==0  ) {
				
				System.out.println(Index +" is Divisible by 7");
				
		}}
			for (int Index1 =start;Index1<=end;Index1++) {
				
				if (Index1 % 13 ==0  ) {
					
					System.out.println(Index1 +" is Divisible by 13");
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
