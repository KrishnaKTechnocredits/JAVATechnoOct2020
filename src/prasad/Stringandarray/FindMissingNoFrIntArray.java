package prasad.Stringandarray;

/*Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing.
You need to write a Java program to find that missing number in an array.*/
public class FindMissingNoFrIntArray {
	
	int findMissingNumber(int[]numbers) {
		int missingNo=0;
		for(int index=0,i=1;index<numbers.length;index++,i++) {
			if(numbers[index]!=i) {
				missingNo=i;
				break;
			}
		}
		
		return missingNo;
}
	
	public static void main(String[]arg) {
		FindMissingNoFrIntArray findmissingnofrintarray = new FindMissingNoFrIntArray();
		int[]array= {1,3,4,5,6,7,8,10};
		int missingElement=findmissingnofrintarray.findMissingNumber(array);
		if(missingElement>0)
		System.out.println("Missing number in given array [1-10]:- " + missingElement);
		else 
			System.out.println("No missing number in given array.");
	}
}


