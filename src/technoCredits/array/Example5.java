package technoCredits.array;

public class Example5 {
	
	void processData(int[] arr) {
		arr[2] = 100;
		System.out.println(arr[2]); //
	}
	
	void m1(int x) {
		x = 100;
	}
	
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		Example5 example5 = new Example5();
		example5.processData(num);
		System.out.println(num[2]); //
	}
}
