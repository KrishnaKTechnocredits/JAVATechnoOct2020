package suvela.assignment30;

import java.util.Arrays;

public class DuplicateNumber {
	void findDuplicateNum(int[] array) {
		
		System.out.println("Array:" + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			int count=0;
			int num = array[i];
			for (int j = i+1; j < array.length; j++) {
				if(num==array[j] && array[j]!=-1) {
					count++;
					array[j]=-1;
					
				}
			}
			if(count>0 && array[i]!=-1)
				System.out.println("Duplicate number is:"+num);
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 6, 7, 6, 9, 6,6,5,5 };
		DuplicateNumber num = new DuplicateNumber();
		num.findDuplicateNum(array);
	}

}
