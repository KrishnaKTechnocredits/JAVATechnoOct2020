package prasad.Stringandarray;
/*WAP to find given 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical*/

public class Identicalarray {
	boolean scanarray(int[]arraya,int[]arrayb) {
			boolean flag=false;
			if(arraya.length==arrayb.length) {
				for(int index=0;index<arraya.length;index++) {
					if(arraya[index]==arrayb[index])
						flag=true;
					else {
						flag=false;
						break;
					}
			}	
	}
			return flag;
} 
	
	public static void main(String[]arg) {
		Identicalarray identicalarray = new Identicalarray();
		
		int[]array1 = {10,12,55,32,17};
		int[] array2 = {10,12,55,32,17};
		boolean isidentical = identicalarray.scanarray(array1,array2);
		if(isidentical)
			System.out.println("Given two arrays are indentical");
		else
			System.out.println("Given two arrays are NOT indentical");
		System.out.println("===========================================");
		int[]array3 = {10,12,55,32,17,99};
		int[] array4 = {10,12,70,32,17};
		boolean isidentical01 = identicalarray.scanarray(array3,array4);
		if(isidentical01)
			System.out.println("Given two arrays are indentical");
		else
			System.out.println("Given two arrays are NOT indentical");
		System.out.println("===========================================");
		int[]array5 = {10,12,55,32,17};
		int[] array6 = {10,12,99,32,17};
		boolean isidentical02 = identicalarray.scanarray(array5,array6);
		if(isidentical02)
			System.out.println("Given two arrays are indentical");
		else
			System.out.println("Given two arrays are NOT indentical");
	}
}

