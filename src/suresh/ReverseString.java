package suresh;
/*WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */
public class ReverseString {
	
	void reverseWord(String word) {
		for(int index= word.length()-1;index>=0;index--) {
			System.out.print(word.charAt(index));
		}
		System.out.println();
		
	}
	void reverseWordFromArray(String[] input) {
		for(int index= input.length-1;index>=0;index--) {
			System.out.println(input[index]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reversestring = new ReverseString();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		System.out.println("==========Printing Reverse String=======");
		reversestring.reverseWord("This is Technocredits");
		System.out.println("==========Printing Reverse Array=======");
		reversestring.reverseWordFromArray(input);
	}

}
