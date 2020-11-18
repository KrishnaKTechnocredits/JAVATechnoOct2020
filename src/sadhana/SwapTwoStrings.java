package sadhana;
/*Assignment_20
 Swap two string using third variable
 */
public class SwapTwoStrings {
	public void printData(String a, String b) {
		System.out.println("Before swapping :");
		System.out.println("String One: "+a);
		System.out.println("String Two: "+b);
		String temp =a;
		a=b;
		b=temp;
		System.out.println("After swapping string1: ");
		System.out.println("String One: "+a);
		System.out.println("String Two: "+b);
	}

	public static void main(String[] args) {
		new SwapTwoStrings().printData("Sadhana", "Pawar");
	}

}
