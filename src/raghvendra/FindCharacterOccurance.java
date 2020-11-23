package raghvendra;
//Find occurrence of each character in string
import java.util.Scanner;
public class FindCharacterOccurance {
	void findCharacterInString(String rr) {
		int count=0;
		for(int index=0;index<rr.length();index++) {
			char ch=rr.charAt(index);
			for(int inner=0;inner<rr.length();inner++) {
				if(rr.charAt(inner)==ch)
					count++;
			}
			System.out.println("Character "+ch+" ocuurance "+count+" times");
			count=0;
		}
	}

	public static void main(String[] args) {
		FindCharacterOccurance characterOccurance=new FindCharacterOccurance();
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		characterOccurance.findCharacterInString(name);
	}

}
