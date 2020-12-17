/*Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not.

*/
package suvela.assignment38;

public class FindNuminFibonacci {
	void findNum(int num) {

		int i = 0, j = 1, add = 0;

		System.out.println("Fibonacci series: ");
		System.out.print(i + "," + j);
		while (add < num) {
			add = i + j;
			System.out.print("," + add);
			i = j;
			j = add;

		}
		System.out.println("-----------------");
		if (add == num)
			System.out.println(" Given number " + num + " is present in fibonacci series");
		else
			System.out.println("Given number " + num + " is not present in fibonacci series");
	}

	public static void main(String[] args) {
		FindNuminFibonacci fn = new FindNuminFibonacci();
		fn.findNum(5);
		fn.findNum(0);
		fn.findNum(15);

	}

}
