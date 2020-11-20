package prasad;
/*Program : 3 
swap 2 String with using 3rd variable*/
import java.util.Scanner;
public class Swapstringwithvar {
	void swap(String fname,String lname) {
		String temp;
		temp=fname;
		fname=lname;
		lname =temp;
		System.out.println("First name : "+ fname);
		System.out.println("Last name: "+ lname);
	}
	
	public static void main(String[]arg) {
		Swapstringwithvar swapstringwithvar = new Swapstringwithvar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstname = scanner.next();
		System.out.println("Enter last name: ");
		String lastname = scanner.next();
		System.out.println("Swapping first name and last name:");
		swapstringwithvar.swap(firstname,lastname);
	}
}
