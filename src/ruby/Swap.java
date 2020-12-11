package ruby;

/*Assignment-20 : 

Program : 1 
swap 2 numbers with using 3rd variable

Program : 2 
swap 2 numbers without using 3rd variable

Program : 3 
swap 2 String with using 3rd variable

Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class

Submit all assignments before Monday EOD*/

public class Swap {
	void swapNum(int num1, int num2) {
		System.out.println("Numbers: "+num1+" "+num2);
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swap: "+num1+" "+num2);
	}
	
	void swapNumWithoutVar(int num1, int num2) {
		System.out.println("Numbers to be swap without Variable: "+num1+" "+num2);
		num1= num1+num2;
		num2=num1-num2;
		num1=num1-num2;		
		System.out.println("After Swap without Variable: "+num1+" "+num2);
		
	}
	
	void swapWord(String a, String b) {
		System.out.println("Words: "+a+" "+b);
		String temp="";
		temp=a;
		a=b;
		b=temp;
		System.out.println("Ater Swap: "+a+" "+b);	
	}
	
	void swapWordWithoutVar(String a, String b) {
		System.out.println(a+" "+b);
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After Swap: "+a+" "+b);	
	}

	public static void main(String[] args) {
		Swap swap = new Swap();
		swap.swapNum(16, 89);
		swap.swapNumWithoutVar(10, 20);
		swap.swapWord("hello","World" );
		swap.swapWordWithoutVar("techno", "Credits");
	}

}
