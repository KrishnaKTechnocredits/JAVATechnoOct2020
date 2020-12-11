package anjaliP;
/*Assignment-19 : Program1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */
public class ReverseStringAssign19_prg1 {
	
	   static void reverseWord(String Word){
		   for(int index =Word.length()-1; index >=0 ;index--)
		      System.out.print(Word.charAt(index));
			}

		public static void main(String[] args) {
			String str = ("This is technocredits");
			System.out.println("--Actual String--"+"\n" + str);
			System.out.println("--Reverse String--");
		   ReverseStringAssign19_prg1.reverseWord(str);

		   }

}
