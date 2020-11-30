package nitin;
/* Assignment-19 : Program : 1 - WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT */
public class ReverseString {
	public void stringReverse(String word) {
		for(int index=word.length()-1;index>=0;index--) {
			System.out.print(word.charAt(index));
		}
	}
	public static void main(String[] args) {
		String word="This is technocredits";
		System.out.println("Input : "+word);
		System.out.print("Output in Reverse : ");
		new ReverseString().stringReverse(word);
	}
}
