package vaibhav;

/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array.*/

public class SecondMax {
	
	public static void getSecondElement(int[] array1) {
		int len = array1.length;
		for (int index = 0 ; index < len;index++) {
			for (int innerIndex = index+1 ; innerIndex < array1.length;innerIndex++) {
				int temp = 0;
				if (array1[index] > array1[innerIndex] ) {
					temp = array1[index];
					array1[index] = array1[innerIndex];
					array1[innerIndex] = temp;				
				}				
			}			
		}	
		
		System.out.println("Second Max number from list is "+ array1[len-2]);
	}

	public static void main(String[] args) {		
		int [] array1 = { 12,43,23,65,87,23,45,54,66};
		SecondMax.getSecondElement(array1);	
	}
}
