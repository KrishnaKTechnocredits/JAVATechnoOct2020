package prasad.Stringandarray;
/*Program 2: Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {1,5,2,7,3,5}
then duplicated number is 3.*/

 public class Finddupnoinarray {
	 int duplicateElements(int[]array) {
		 int dup=0;
		 for(int index=0 ; index<array.length;index++) {
			 int num = array[index];
			 for(int innerindex=0;innerindex<array.length;innerindex++) {
				 if(index!=innerindex && num==array[innerindex]) {
					 dup=num;
					 break;
					  
				 }
			 }
		 }
		 return dup;
	 }
	 
	 
	 public static void main(String[]arg) {
		 Finddupnoinarray  finddupnoinarray = new Finddupnoinarray();
		 int []numbers = {1,5,2,7,3,9,0,9};
		 System.out.println("Duplicate number in given array:- " + finddupnoinarray.duplicateElements(numbers)); 
	 }
}