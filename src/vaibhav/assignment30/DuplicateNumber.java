package vaibhav.assignment30;

/*Program 2: Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

public class DuplicateNumber {	
	
	public static void getDuplicate(int [] array) {	
		System.out.println("Duplicate number is");
		for(int i = 0 ; i < array.length;i++) {
			int count =0;
			int number = array[i];
			for (int j = 0 ; j < array.length;j++) {
				if(array[j] == number) {
					if (i < j)
						count ++;
					/*else if (i > j)
						continue;*/
				}
				
			}
			if (count == 1) {
				System.out.print(" "+number);
				
			}
		}		
	}
	public static void main(String[] args) {
		int [] array= {0,3,1, 2, 3};
		DuplicateNumber.getDuplicate(array);		
	}
}
