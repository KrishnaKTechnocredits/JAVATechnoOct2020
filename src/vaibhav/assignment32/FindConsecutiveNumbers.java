package vaibhav.assignment32;

public class FindConsecutiveNumbers {
	
	static public void getConsecutive(int [] array) {
		for (int i = 0 ;i < array.length-2; i++) {
			if(array[i+1] == array[i]+1 && array[i+2] == array[i]+2 ) {
				System.out.println("Hi -->"+array[i]+","+array[i+1]+","+array[i+2]);				
			}			
		}
		
	}
	public static void main(String[] args) {		
		int [] array = {1,2,3,5,8,9,11,12,13,14,15,18,19,20,29};
		FindConsecutiveNumbers.getConsecutive(array);
	}
}
