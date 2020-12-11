package ruby;

import java.util.Arrays;

/*return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
*/
public class Assignment35 {

	boolean getArmstrongNum(int num) {
		int sum = 0, tempNum = num;
		while (tempNum > 0) {
			int dig = tempNum % 10;
			tempNum = tempNum / 10;
			sum = sum + (dig * dig * dig);
		}
		if (sum == num)
			return true;
		return false;
	}
	
	void sumOfArmstrong(int[] input){
		System.out.println("Input Array "+ Arrays.toString(input));
		int sum=0;
		for(int index=0; index<input.length;index++) {
			if(getArmstrongNum(input[index])) {
				sum+=input[index];
			}
		}System.out.println("Sum of Armstrong numbers "+sum);
	}

	public static void main(String[] args) {
		Assignment35 assign = new Assignment35();
		int[] input = {153, 111, 124, 371};
		assign.sumOfArmstrong(input);;
	}

}
