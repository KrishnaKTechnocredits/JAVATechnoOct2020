package prasad.Stringandarray;

import java.util.Arrays;
/*This program prints upto 2 missing elements in given int array. These 2 missing elements could be consecutive elements or distant 
 elements.*/

public class Findtwomissingnosinarray {
	
	void findMissingElement(int[]array) {
		boolean flag=false;
		for(int index=0,i=1;index<array.length;index++,i++) {
			if(array[index]!= i && array[index]==i+1) {
				System.out.print(i + " ");
				i=array[index];	
				flag = true;
				}
			else if(array[index]!= i && array[index]==i+2) {
				System.out.print(i + " ");
				System.out.print(i+1 + "");
				i=array[index]+2;
				flag=true;
			}
		}
		if(!flag)
			System.out.println("No missing number in given array");
	}
	
	public static void main (String[]arg) {
		Findtwomissingnosinarray findtwomissingnosinarray = new Findtwomissingnosinarray();
		int[]numbers = {1,2,3,4,7,8,9,10};
		int[]numbers1= {1,2,3,4,5,6,7,8,9,10};
		int[]numbers2= {1,3,4,5,6,7,8,10};
		System.out.println("Input 1:-" + Arrays.toString(numbers));
		System.out.println("Missing number(s) in above range:-");
		findtwomissingnosinarray.findMissingElement(numbers);
		System.out.println("");
		System.out.println("Input 2:-" + Arrays.toString(numbers1));
		System.out.println("Missing number(s) in above range:-");
		findtwomissingnosinarray.findMissingElement(numbers1);
		System.out.println("");
		System.out.println("Input 3:-" + Arrays.toString(numbers2));
		System.out.println("Missing number(s) in above range:-");
		findtwomissingnosinarray.findMissingElement(numbers2);
	}

}

