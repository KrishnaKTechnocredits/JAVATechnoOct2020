package ritika.Assignments;
/*
 
Assignment-19 :

Program : 1
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT
 */
public class Asgmt_19_Pg1 {
	
	void reverseString (String word) {
		for (int i = word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
		}
	}
	public static void main(String[] args) {
		String input = "This is technocredits";
		Asgmt_19_Pg1 program1 = new Asgmt_19_Pg1();
		program1.reverseString(input);
	}

}
