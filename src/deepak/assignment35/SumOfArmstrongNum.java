package deepak.assignment35;

public class SumOfArmstrongNum {
	
	void processData(int[] arr) {
		
		int sum=0;
		int remainder=0;
		int temp = 0;
		
		for(int i=0; i<arr.length;i++) {
			int armstrong = 0;
			int num = arr[i];
			
		while(num!=0) {
	
			remainder = num%10;
			armstrong = armstrong + (remainder * remainder * remainder);
			num = num/10;
		}
		if(arr[i] == armstrong) {
			sum = sum + arr[i];
		}	
	}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		int[] arr = {153, 111, 124, 371};
		
		SumOfArmstrongNum refVar = new SumOfArmstrongNum();
		refVar.processData(arr);
	}
}
