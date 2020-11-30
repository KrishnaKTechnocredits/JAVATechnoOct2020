package ritika.Assignments;
/* Assignment-20 :

Program : 3
swap 2 String with using 3rd variable

Program : 4
swap 2 String without using 3rd variable
Hint : use SubString method of String class
*/
public class Asgmt_20_Pg_3and4 {
	void swapStringUsing3rdVar(String s1, String s2) {
		System.out.println("Strings at position 1 and 2 respectively are: " +s1 +" and "+s2);
		String temp = s1;
		s1 = s2;
		s2=temp;
		System.out.println("Strings after swapping at position 1 and 2 respectively are: " +s1 +" and "+s2);
	}
	
	void swapStringWithout3rdVar(String s1, String s2) {
		System.out.println("Strings at position 1 and 2 respectively are: " +s1 +" and "+s2);
		s1 = s1+" "+s2;
		s2 = s1.substring(0, s1.indexOf(" "));
		s1 = s1.substring(s1.indexOf(" ")+1);
		System.out.println("Strings after swapping at position 1 and 2 respectively are: " +s1 +" and "+s2);
	}
	public static void main(String[] args) {
		Asgmt_20_Pg_3and4 swapString = new Asgmt_20_Pg_3and4();
		System.out.println("Swapping numbers using 3rd variable");
		swapString.swapStringUsing3rdVar("Gandhi","Ritika");
		System.out.println("==================================================");
		System.out.println("Swapping numbers without using 3rd variable");
		swapString.swapStringWithout3rdVar("Credits","Techno");


	}

}
