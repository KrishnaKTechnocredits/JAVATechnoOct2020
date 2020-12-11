package monika;
/*Assignment-19 :



Program : 2
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}


*/

public class StringReverse{

   void reverseWord(String Word){
   
   for(int index =Word.length()-1; index >=0 ;index--){
      System.out.print(Word.charAt(index));
	  
	  }
	  
	  System.out.println();
	  
	}

public static void main(String[] args) {

   StringReverse stringReverse = new StringReverse();
   stringReverse.reverseWord("This is technocredits");
   //stringReverse.reverseWord("credits");
   }
 }  
