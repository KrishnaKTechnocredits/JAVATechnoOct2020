package anjaliP;

public class Example2 {
	char processData(double data) {
		if(data<122.45)
			return 'T';
		return 'A';
	}	
	public static void main(String[]a) {
		Example2 emp2 = new Example2();
		char ch = emp2.processData(100.25);
		System.out.println(ch);
		
	}
	
}
