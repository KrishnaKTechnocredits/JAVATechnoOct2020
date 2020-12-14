package vaibhav.coding.exam5;

public class GetMaxNumber {

	public static void main(String[] args) {
		int [] numbers = {3,5,5,7,9,13,11,12};
		GetMaxNumber.getBiggerNumber(numbers);
	}

	private static void getBiggerNumber(int[] numbers) {
		int temp = numbers[0];
		System.out.print(" "+temp);
		for(int i = 0 ;i< numbers.length;i++) {
			if (numbers[i] > temp) {
				temp = numbers[i];
				System.out.print(","+temp);
			}			
		}		
	}

}
