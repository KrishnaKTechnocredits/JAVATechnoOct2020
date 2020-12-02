/*Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class*/

package shrutiS.assignment20;

public class SwapStringWithout3rdVariable {

	void printSwapNumber(String name1, String name2) {
		System.out.println("Name1 = " + name1);
		System.out.println("Name2 = " + name2);
		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());
		System.out.println("After swap");
		System.out.println("Name1 = " + name1);
		System.out.println("Name2 = " + name2);
	}

	public static void main(String[] args) {
		SwapStringWithout3rdVariable swapNumber = new SwapStringWithout3rdVariable();
		String name1 = "Shikha";
		String name2 = "Arohi";
		swapNumber.printSwapNumber(name1, name2);
		System.out.println(name1 + "  " + name2);

	}
}
