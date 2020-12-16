package Assignment39;

public class Addition {
	
	void Addition(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Addition of interger is : "+sum);
	}
	void Addition(double num1,double num2) {
		double sum=num1+num2;
		System.out.println("Addition of decimal is : "+sum);

	}
	void Addition(String s1,String s2) {
		String sum=s1+s2;
		System.out.println("Addition of String is : "+sum);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Addition add=new Addition();
		add.Addition(10,20);
		add.Addition(2.30,54);
		add.Addition("Himali","Ingle");

	}

}
