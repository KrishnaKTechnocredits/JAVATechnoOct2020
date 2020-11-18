package technoCredits.array;

public class Example6 {
	void m1(int[] temp) {
		temp[0] = 100;
	}
	void m2(int[] num1) {
		num1[num1.length-1] = 0;
		num1[2] = 99;
	}
	void printData(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
	}
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		//int[] arr = new int[]{10,20,30,40};
		
		Example6 example6 = new Example6();
		example6.m1(num);
		example6.m2(num);
		example6.printData(num);
	}
}
