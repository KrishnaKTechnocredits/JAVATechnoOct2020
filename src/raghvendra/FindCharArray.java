package raghvendra;
import java.util.Scanner;
public class FindCharArray {
	void findCharacterArray(String rr, char ch) {
		int count=0;
		for (int index=0;index<rr.length();index++) {
			if(rr.charAt(index)==ch)
					count++;
		}
		if(count>0)
			System.out.println("Character "+ch+" occured "+count+" times");
		else
			System.out.println("Invalid character not in string");
	}

		public static void main(String[] args) {
			FindCharArray findCharacter=new FindCharArray();
			System.out.println("Enter String:");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			System.out.println("Enter Character you want to find:");
			char ch=sc.next().charAt(0);
			findCharacter.findCharacterArray(name, ch);
		}

}
