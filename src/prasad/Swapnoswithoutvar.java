package prasad;
/*Program : 2 
swap 2 numbers without using 3rd variable*/
import java.util.Scanner;
public class Swapnoswithoutvar {
	int number1 ;
	int number2;
	int  swapb(int n1 , int n2 ) {
		n1 = n1+n2;
		n2=n1-n2;
		return n2;
	}
	int swapa(int n1 , int n2) {
		n1=n1+n2; 
		n2=n1-n2;
		n1=n1-n2;
		return n1;
	}
	public static void main(String[]arg) {
		Swapnoswithoutvar swapnoswithoutvar = new Swapnoswithoutvar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number (A):");
		int no1 = scanner.nextInt();
		swapnoswithoutvar.number1=no1;
		System.out.println("Enter another number (B):");
		int no2 = scanner.nextInt();
		swapnoswithoutvar.number2=no2;
		System.out.println("A = "+ swapnoswithoutvar.number1 + " ; "+ "B = "+swapnoswithoutvar.number2);
		int No2 = swapnoswithoutvar.swapb(swapnoswithoutvar.number1,swapnoswithoutvar.number2);
		int No1 = swapnoswithoutvar.swapa(swapnoswithoutvar.number1,swapnoswithoutvar.number2);
		swapnoswithoutvar.number1 = No1;
		swapnoswithoutvar.number2=No2;
		System.out.println("Printing A & B after swapping:-");
		System.out.println("A = " +swapnoswithoutvar.number1 + " ; " + "B = "+ swapnoswithoutvar.number2 );
	}

} 
