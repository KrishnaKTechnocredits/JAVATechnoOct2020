package vaibhav.assignment39;

/*Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/


public class Addition {
	
	Addition(int num1,int num2){
		int num3 = num1 + num2;	
		System.out.println("Additon of two integer is "+num3);
	}
	
	Addition(double num1,double num2){
		double num3 = num1 + num2;	
		System.out.println("Additon of two decimal is "+num3);
	}
	
	Addition(String num1,String num2){
		String num3 = num1 + num2;
		System.out.println("Additon of two Words is "+num3);		
	}

	public static void main(String[] args) {
		Addition addition = new Addition(10, 20);
		Addition addition1 = new Addition(3.14, 3.14);
		Addition addition2 = new Addition("Vaibhav","Jagtap");
	}
}
