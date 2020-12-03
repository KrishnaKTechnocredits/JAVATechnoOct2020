package Himali_Assignment34;

public class Program2 {
	void verifyNumberPalindrom(int num ){
		int rem,sum=0;
		int temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
			
		}
		if(temp==sum) {
			System.out.println(temp +" is palindrom");
		}else {
			System.out.println(temp +"is not palindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 program2=new Program2();
		int input=121;
		program2.verifyNumberPalindrom(input);
		

	}

}
