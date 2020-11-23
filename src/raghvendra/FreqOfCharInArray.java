package raghvendra;
/*Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5*/
import java.util.Scanner;
public class FreqOfCharInArray {
	void findCharacterInStringArray(String[] rr, char ch) {
		int count=0;
		for (int index=0;index<rr.length;index++) {
				String name=rr[index];
				for(int inner=0;inner<name.length();inner++) {
					if (name.charAt(inner)==ch)
						count=count+1;
				}
		}
		if(count>0)
			System.out.println("Character "+ch+" occured "+count+" times");
		else
			System.out.println("Invalid character not in string");
	}

		public static void main(String[] args) {
			FreqOfCharInArray freqOfCharInArray =new FreqOfCharInArray();
			System.out.println("Enter number of names you want to enter:");
			Scanner sc=new Scanner(System.in);
			int length=sc.nextInt();
			String[] names=new String[length];
			for(int index=0;index<length;index++) {
				System.out.println("Enter names:");
				names[index]=sc.next();
			}
			System.out.println("Enter Character you want to find:");
			char ch=sc.next().charAt(0);
			freqOfCharInArray.findCharacterInStringArray(names, ch);
		}

}
