package technoCredits.array;

public class Example2 {

	static int sum(int[] num){
		int totalSum = 0;
		for(int index=0;index<num.length;index++) {
			totalSum = totalSum + num[index];
		}
		return totalSum;
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int ans = Example2.sum(num);
		System.out.println(ans);
	}
}
