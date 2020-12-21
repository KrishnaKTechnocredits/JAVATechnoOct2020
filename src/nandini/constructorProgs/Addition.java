package nandini.constructorProgs;

public class Addition {

	Addition(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Addition of two integers is: " + sum);
	}
	
	Addition(double num1, double num2){
		double sum = num1 + num2;
		System.out.println("Addition of two decimal is: " + sum);
	}
	
	Addition(String str1, String str2 ){
		String str = str1 + str2;
		System.out.println("Addition of two String is: " + str);
	}
	
	public static void main(String args[]) {
		Addition integer = new Addition(10,5);
		Addition decimal = new Addition(12.5,14.5);
		Addition string = new Addition("Techno","Credits");
		
	}
}
