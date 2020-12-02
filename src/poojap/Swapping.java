/*Assignment-20 : 
Program : 1 
swap 2 numbers with using 3rd variable

Program : 2 
swap 2 numbers without using 3rd variable

Program : 3 
swap 2 String with using 3rd variable

Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class*/

package poojap;

public class Swapping {
	void swapnum(int num1, int num2) {
		System.out.println("Numbers are : " + num1 + " , " + num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping Number is : " + num1 + " , " + num2);
	}

	void swapwithoutvariable(int num1, int num2) {
		System.out.println("Before swapping Numbers are: " + num1 + " , " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swapping without third variable " + num1 + " , " + num2);

	}

	void swapString(String string1, String string2) {
		System.out.println("Before swapping String is : " + string1 + " " + string2);
		String temp = "";
		temp = string1;
		string1 = string2;
		string2 = temp;
		System.out.println("After swapping String is : " + string1 + " " + string2);
	}

	void swapStringWithoutVariable(String string1, String string2) {
		System.out.println("Before swapping String is : " + string1 + " " + string2);
		string1 = string1 + string2;
		string2 = string1.substring(0, string1.length() - string2.length());
		string1 = string1.substring(string2.length());
		System.out.println("After swapping  without third variable String is : " + string1 + " " + string2);

	}

	public static void main(String[] args) {
		Swapping swapping = new Swapping();
		swapping.swapnum(20, 10);
		System.out.println("--------------------------------------");
		swapping.swapwithoutvariable(40, 30);
		System.out.println("--------------------------------------");
		swapping.swapString("Pekhale", "Pooja");
		System.out.println("-------------------------------------");
		swapping.swapStringWithoutVariable("credit", "techno");
	}
}
