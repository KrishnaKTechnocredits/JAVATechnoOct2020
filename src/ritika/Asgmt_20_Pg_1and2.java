package ritika;
/* Assignment-20 :

Program : 1
swap 2 numbers with using 3rd variable

Program : 2
swap 2 numbers without using 3rd variable

*/
public class Asgmt_20_Pg_1and2 {
	void swapNumberUsing3rdVar(int num1, int num2) {
		System.out.println("Numbers at position 1 and 2 respectively are: " +num1 +" and "+ num2);
		int temp = num1;
		num1 = num2;
		num2=temp;
		System.out.println("Numbers after swapping at position 1 and 2 respectively are: " +num1 +" and "+ num2);
	}
	
	void swapNumberWithout3rdVar(int num1, int num2) {
		System.out.println("Numbers at position 1 and 2 respectively are: " +num1 +" and "+ num2);
		num1 =num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Numbers after swapping at position 1 and 2 respectively are: " +num1 +" and "+ num2);
	}
	public static void main(String[] args) {
		Asgmt_20_Pg_1and2 swapNumber = new Asgmt_20_Pg_1and2();
		System.out.println("Swapping numbers using 3rd variable");
		swapNumber.swapNumberUsing3rdVar(79, 31);
		System.out.println("==================================================");
		System.out.println("Swapping numbers without using 3rd variable");
		swapNumber.swapNumberWithout3rdVar(63, 47);
	}

}
