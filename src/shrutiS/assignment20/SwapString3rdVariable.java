/*Program : 3 
swap 2 String with using 3rd variable*/

package shrutiS.assignment20;

public class SwapString3rdVariable {
	String temp;

	void printSwapNumber(String name1, String name2) {
		System.out.println("Name1 = " + name1);
		System.out.println("Name2 = " + name2);
		String temp = name1;
		name1 = name2;
		name2 = temp;
		System.out.println("After swap");
		System.out.println("Name1 = " + name1);
		System.out.println("Name2 = " + name2);
	}

	public static void main(String[] args) {
		SwapString3rdVariable swapNumber = new SwapString3rdVariable();
		swapNumber.printSwapNumber("Shikha", "Arohi");
	}
}
