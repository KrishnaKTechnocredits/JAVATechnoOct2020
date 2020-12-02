package suresh;

/* Assignment - 16 - find the occurence of a string */
import java.util.Scanner;


public class StringComparison {

	static void charOccurence(String word) {
		//String word = "technocredits";
		for(int index=0;index<word.length();index++) {
			int count=0;
			char ch = word.charAt(index);
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(i)==ch)
					count++;
				
			}
			System.out.println("Charachter occurence: "+ ch + " " + count + "- times");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String string=scanner.next();
		StringComparison.charOccurence(string);
	
}

}
