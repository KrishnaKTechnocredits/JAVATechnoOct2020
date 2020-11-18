package prasad;
/*Program : 1
swap 2 numbers with using 3rd variable*/

import java.util.Scanner;
public class Swaptwonosusingvar {
	int number1;
	int number2;
	
	void swap(int no1 , int no2) {
		int temp=0;
		temp=no2;
		no2=no1;
		no1=temp;
		System.out.println("Numbers Swapped:-");
		System.out.println("A = " + no1+" ; "+"B = " + no2);
	}
	
	public static void main(String[]arg) {
		Swaptwonosusingvar swaptwonosusingvar = new Swaptwonosusingvar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number (A):- ");
		int numbera=scanner.nextInt();
		swaptwonosusingvar.number1=numbera;
		System.out.println("Enter a number (B):- ");
		int numberb=scanner.nextInt();
		swaptwonosusingvar.number2=numberb;
		System.out.println("A = "+ swaptwonosusingvar.number1 + " ; "+ "B = "+swaptwonosusingvar.number2);
		swaptwonosusingvar.swap(swaptwonosusingvar.number1, swaptwonosusingvar.number2);
	}
}
