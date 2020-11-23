
/* Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class*/
package suvela;

public class Assign20_4 {
	void replace(String s1, String s2) {
		s1= s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("Swapped strings are : "+s1+" "+s2);
	}
	public static void main(String[] args) {
		String s1= "Suvela";
		String s2="Ankita";
		Assign20_4 assign = new Assign20_4();
		System.out.println("UnSwapped strings are : "+s1+" "+s2);
		assign.replace(s1, s2);
		
	}

}
