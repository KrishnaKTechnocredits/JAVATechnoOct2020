package technoCredits.stringExamples;

public class ModEx1 {
	// 17 % 18 // 17 % 19 
	void findPrime(int start, int end) {
		boolean flag = true;
		int count = 0;
		for(int number=start;number<=end;number++) {
			for(int i=2;i<end;i++) {
				if(number%i == 0) {
					System.out.println(number + " is not prime");
					count++;
				}
			}
			if(count == 0) 
				System.out.println(number + " is prime");
		}
		
	}

	void findPrimeNos(int startIndex, int endIndex){
		for(int i=startIndex; i<=endIndex; i++){
			int count = 0;
			for(int innerIndex=1; innerIndex<=i; innerIndex++){
				if(i%innerIndex == 0) {
					count++;
					if(count >2)
						break;
				}
			}
			if(count == 2)
				System.out.print(" "+i);
		}
	}
	
	public static void main(String[] args) {
		ModEx1 modEx1 = new ModEx1();
		modEx1.findPrimeNos(2,50);
		
	}
}
