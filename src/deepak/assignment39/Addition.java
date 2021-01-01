package deepak.assignment39;

public class Addition {


	void addInteger(int a, int b) {
		
		int result = a + b;
		System.out.println("Addition of integers "+ result);
	}
	
	void addDecimal(double a, double b) {
		
		double result = a + b;
		System.out.println("Addition of decimals "+ result);
	}
	
	void addString(String a, String b) {
		
		String result = a + b;
		System.out.println("Addition of Strings "+result);
	}
	
	public static void main(String[] args) {
		
		Addition refVar = new Addition();
		refVar.addInteger(10, 5);
		refVar.addDecimal(2.5, 3.6);
		refVar.addString("Deepak", "Latad");
	}

}
