package technoCredits.array;

public class Example1 {

	void display(String[] input) {
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index]);
		}
	}
	
	void displayReverseArray(String[] arr) {
		for(int index=arr.length-1;index>=0;index--) {
			System.out.println(arr[index]);
		}	
	}
	
	void displayReverseArray1(String[] arr) {
		for(int index=arr.length-1;index>0;index--) {
			System.out.println(arr[index]);
		}	
	}

	void diplayNumbers(int[] num) {
		
		for(int index=0;index<num.length;index++) {
			System.out.println(num[index]);
		}
	}
	
	public static void main(String[] args) {
		String[] name = { "Dhara", "Ankita", "Ankit", "Anjali" };
		//System.out.println(name); // it will print memory address which is assigned to name array
		Example1 example1 = new Example1();
		example1.displayReverseArray(name);
		
		int[] num = new int[3];
		num[2] = 100;
		num[0] = 20;
		num[1] = 33;
		num[3] = 44;
		example1.diplayNumbers(num);
	}

}
