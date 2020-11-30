package vaibhav;

public class ArrayMatch {
	
	public static void compareArray(int []a1) {
				System.out.println("Duplicate values are ");
				for (int index = 0 ; index < a1.length; index ++) {
					for (int innerIndex = 0 ; innerIndex < a1.length; innerIndex ++) {
						if (a1[index] == a1 [innerIndex]) {
							if (innerIndex > index) {
								System.out.println(""+a1[index]);
								break;
							}
							else if (index > innerIndex ) 
								break;								
						}
					}
						
					}						
			}	

	public static void main(String[] args) {
		int [] arr1= {10,12,13,12,13,32,13,13,13,13,32};
		ArrayMatch.compareArray(arr1);
		}
	
}

