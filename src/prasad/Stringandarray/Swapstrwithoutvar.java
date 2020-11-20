package prasad.Stringandarray;

/*swap 2 String without using 3rd variable
Hint : use SubString method of String class*/
import java.util.Scanner;
public class Swapstrwithoutvar {
	
	void swap(String fname , String lname) {
		int lnamelength= lname.length();
		int fnamelength= fname.length();
		int totallength=fnamelength+lnamelength;
		fname = fname+lname.substring(0,lnamelength);
		lname = lname+fname.substring(0,fnamelength);
		if(lnamelength>fnamelength) {
			int diff=lnamelength-fnamelength;
			fname=fname.substring((totallength-fnamelength-diff),totallength);  
			lname=lname.substring((totallength-lnamelength+diff),totallength);
		}
		else {
			int diff=fnamelength-lnamelength;
			fname=fname.substring((totallength-fnamelength+diff),totallength);  
			lname=lname.substring((totallength-lnamelength-diff),totallength);
		}
		System.out.println("First name: " + fname);
		System.out.println("Last name: " + lname);
	}

	public static void main(String[]arg) {
		Swapstrwithoutvar swapstrwithoutvar = new Swapstrwithoutvar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name:");
        String firstname= scanner.next();
        System.out.println("Enter last name:");
        String lastname= scanner.next();
        System.out.println("First name: "+ firstname);
        System.out.println("Last name: " + lastname);
        System.out.println("Swapping First name and Last name values:");
        swapstrwithoutvar.swap(firstname, lastname);
	}
}
