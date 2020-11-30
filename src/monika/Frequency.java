package monika;
/*Find the frequency of character from a given String array.
Note: Take String and character from the user */
import java.util.Scanner;

public class Frequency {

	int freqCharacter(String string,char ch) {

		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==ch)
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		
	        Frequency frequency= new Frequency();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter name: ");
		String string= sc.next();

		System.out.println("Please enter the character: ");
	        char ch=sc.next().charAt(0);
		int count=frequency.freqCharacter(string,ch);
		System.out.println("The frequency "+ch+ " is: "+count);
	}

}