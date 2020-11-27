package rohan;

/*Program : 1 
swap 2 numbers with using 3rd variable

Program : 2 
swap 2 numbers without using 3rd variable

Program : 3 
swap 2 String with using 3rd variable

Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class*/

public class SwapNumberString {

	void swapNumbersWithThirdVariable(int a, int b) {
		System.out.println("Original: a-"+a+" b: "+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("output: a-"+a+" b: "+b);
	}
	
	void swapNumberWithoutThirdVariable(int a,int b) {
		System.out.println("Original: a-"+a+" b: "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("output: a-"+a+" b: "+b);
	}
	
	void swapStringWithThirdVariable(String str1, String str2) {
		System.out.println("Original: str1-"+str1+" b: "+str2);
		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("output: str1-"+str1+" str2: "+str2);
	}
	
	void swapStringWithoutThirdVariable(String str1, String str2) {
		System.out.println("Original: str1-"+str1+" str2: "+str2);
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println("Output: str1-"+str1+" b: "+str2);
	}
	
	public static void main(String[] args) {
		SwapNumberString swp = new SwapNumberString();
		System.out.println("-----Swap Numbers with third variable-----");
		swp.swapNumbersWithThirdVariable(10, 20);
		System.out.println("-----Swap Numbers without third variable-----");
		swp.swapNumberWithoutThirdVariable(10, 20);
		System.out.println("-----Swap String with third variable-----");
		swp.swapStringWithThirdVariable("Rohan", "Mahadik");
		System.out.println("-----Swap String with third variable-----");
		swp.swapStringWithoutThirdVariable("Rohan", "Mahadik");
	}
}