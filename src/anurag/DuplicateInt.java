package anurag;

public class DuplicateInt {
	
	
	static void display() {
		int[] arr = {10, 12, 55, 32, 17, 12, 32 };
		
		for (int i = 0; i <arr.length; i++) {
			int count=0;
			for (int j = i; j<arr.length; j++) {
				if (arr[i]==arr[j])
					count++;
			}
			if(count>1)
				System.out.println(arr[i]);
		
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
	}

}
