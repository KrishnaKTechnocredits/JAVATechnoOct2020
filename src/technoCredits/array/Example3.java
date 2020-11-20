package technoCredits.array;

public class Example3 {

	int getMaxNumber(int num[]) {
		int max = 0;
		for(int index=0;index<num.length;index++) {
			if(max < num[index])
				max = num[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		int input[] = {-98,-10,-23,-99,-123,-44,-51};
		int ans = example3.getMaxNumber(input);
		System.out.println("Maximum is " + ans);
	}
}
