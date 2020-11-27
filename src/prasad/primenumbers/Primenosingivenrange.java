package prasad.primenumbers;

/*Prints all prime numbers in given range*/
import java.util.Scanner;
public class Primenosingivenrange {
	void compute(int no1,int no2) {
		System.out.print("All prime numbers in between " + no1 + " & " + no2 + " :-");
		for(int index=no1;index<=no2;index++) {
			int number=index;
			int count=0;
			for(int innerindex=1;innerindex<=no2;innerindex++) {
				if(number%innerindex==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(" " + number + " ");	
		}		
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		Primenosingivenrange primenosingivenrange = new Primenosingivenrange();
		System.out.println("Find all prime numbers that fall in between number(Starting point of the range) :-");
		int number1= scanner.nextInt();
		System.out.println("And number(End point of the range) :-");
		int number2=scanner.nextInt();
		primenosingivenrange.compute(number1,number2);
	}
}
