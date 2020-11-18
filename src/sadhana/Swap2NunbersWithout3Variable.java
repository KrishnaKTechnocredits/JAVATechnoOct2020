package sadhana;
/*Assignment_20
 Swap two numbers without using third variable
 */

public class Swap2NunbersWithout3Variable {
	public void printData(int x,int y) {
		System.out.println("Before swapping");
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
		System.out.println("After swapping");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
	}

	public static void main(String arg[]) {
		Swap2NunbersWithout3Variable swap2NunbersWithout3Variable=new Swap2NunbersWithout3Variable();
		swap2NunbersWithout3Variable.printData(10,30);
	}

}
