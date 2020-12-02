/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array.*/

package kajol;

import java.util.Arrays;

public class FindSecondMaximumNumberFromAnArray {
		void findSecondMaximum(int []inputArray) {
			System.out.println("Given Array : "+ (Arrays.toString(inputArray)));
			int firstMaximum=0;
			int secondMaximum=0;
			for (int index=0;index<inputArray.length;index++) {
				if(inputArray[index]>firstMaximum) {
					secondMaximum=firstMaximum;
					firstMaximum=inputArray[index];
				}else if (inputArray[index]>secondMaximum)
					secondMaximum=inputArray[index];				
			}
			System.out.println("Second Maximum Number in Given Array is : "+secondMaximum);
		}
		
		public static void main(String[] args) {
			int[] inputArray= {12,22,33,35,36,37,36,15};
			new FindSecondMaximumNumberFromAnArray().findSecondMaximum(inputArray);
		}
}
