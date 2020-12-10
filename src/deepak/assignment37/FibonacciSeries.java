package deepak.assignment37;

public class FibonacciSeries {
	
	void processData() {
		
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		
		for(int i=0; i<8; i++) {
			
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.println(temp);
		}	
	}

	public static void main(String[] args) {
		
		FibonacciSeries refVar = new FibonacciSeries();
		refVar.processData();
	}
}
