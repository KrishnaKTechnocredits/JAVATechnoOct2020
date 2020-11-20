package prasad.Stringandarray;

/*Prints occurance of each char in the same word eg. sam ; S: times,A:times.M: times */ 
import java.util.Scanner;

public class Comparechar {
	
	void compare(String word) {
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			int count=0;
			for(int index1=0;index1<word.length();index1++) {
					char ch1 = word.charAt(index1);
					if(ch==ch1)
						count++;		
			}
			System.out.println("Occurance of "+ ch +" : "+ count + " times");
		}
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		Comparechar comparechar = new Comparechar();
		System.out.println("Enter a word:");
		String word = scanner.next();
		comparechar.compare(word);
	}

}
