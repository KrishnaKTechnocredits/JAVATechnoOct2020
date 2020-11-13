package prasad;

import java.util.Scanner;
/*Program 2: Search for pre-defined number in pre-defined array and then search for user entered number in pre-defined array*/
public class FindNumberPredefArray {
	int count;
	
	boolean searchwithoutcount(int[]numbers,int number) {
		boolean flag = false;
		for(int index=0;index<numbers.length-1;index++) {
				if(numbers[index]==number)
					flag = true;	
		}	
		return flag;
	}
	boolean searchwithcount(int[]numbers,int number) {
		boolean flag1 = false;
		for(int index=0;index<numbers.length-1;index++) {
				if(numbers[index]==number) {
					flag1 = true;
				    count++;
				}
		}	
		return flag1;
	}
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		FindNumberPredefArray findnumberpredefarray = new FindNumberPredefArray();
		int[] array = {13,14,14,110,87,14,-11,10};
		int number= 13;
		System.out.println("Pre-defined array:");
		for(int index=0;index<array.length-1;index++) {
			System.out.println(array[index]);
		}
		System.out.println("Searching pre-defined number "+ number + " in above array");
		boolean flag = findnumberpredefarray.searchwithoutcount(array,number);
		if(flag==true)
			System.out.println("Given number "+ number+ " is present in the predefined array");
		else 
			System.out.println("Given number "+ number+ " is NOT present in the predefined array");
		System.out.println("Please enter another number to be searched in pre-defined array: ");
		int number1= scanner.nextInt();
		boolean flag1=findnumberpredefarray.searchwithcount(array, number1);
		if(flag1==true)
			System.out.println("Given number "+ number1+ " is present in the predefined array with frequency "+ findnumberpredefarray.count);
		else 
			System.out.println("Given number "+ number1+ " is NOT present in the predefined array");
		
	}

}
