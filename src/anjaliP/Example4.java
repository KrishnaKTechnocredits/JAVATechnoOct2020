package anjaliP;

public class Example4 {
	char processData(double data){ 
		if(data < 122.45)
			return 'A';
		else if(data < 150)
			return 'B';
		else if(data < 230)
			return 'C';
		return 'z';
	}
	public static void main(String[]a) {
		Example4 example4 = new Example4();
		char ch = example4.processData(100);
		System.out.println(ch);
	}
}
