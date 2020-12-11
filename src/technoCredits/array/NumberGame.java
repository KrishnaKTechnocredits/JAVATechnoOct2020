package technoCredits.array;

public class NumberGame {
	
	int positiveNumberIndex = 0;
	
	int[] getPositiveNumbers(int[] num) {
		int[] positiveNumArr = new int[num.length];
		for(int index=0;index<num.length;index++) {
			if(num[index] > 0) {
				positiveNumArr[positiveNumberIndex] = num[index];
				positiveNumberIndex++;
			}
		}
		return positiveNumArr;
	}
	
	public void display(int[] arr) {
		for(int index=0;index<positiveNumberIndex;index++) {
			/*if(arr[index] != 0)
				break;*/
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-33,-44,23,-32,55,78,99};
		NumberGame numberGame = new NumberGame();
		int[] output = numberGame.getPositiveNumbers(arr);
		numberGame.display(output);
	}
}
