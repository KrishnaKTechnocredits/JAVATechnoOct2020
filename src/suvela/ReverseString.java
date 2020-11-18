
/*Assignment-19 : 

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  
*/
package suvela;

public class ReverseString {
	void stringreverse(String input) {
		String reverse="";
		for(int index=input.length()-1;index>=0;index--) {
			reverse = reverse + input.charAt(index);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		String input= "This is technocredits";
		ReverseString reverse=new ReverseString();
		reverse.stringreverse(input);
	}

}
