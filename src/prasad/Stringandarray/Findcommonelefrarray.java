package prasad.Stringandarray;
/*	Program 1: WAP to Find Common Element Between Two Arrays

input:

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/

public class Findcommonelefrarray {
	void scanArray(int[]array1 , int[]array2) {
		if(array1.length==array2.length) {
			System.out.println("Common elements in given two input arrays:-");
			
			for(int runningindex=0;runningindex<array1.length;runningindex++) {
				int num = array1[runningindex];
				int count=0;
				int count1=0;
				if(runningindex!=0) {               			 // Here when we selected element from array1 for comparison and it is not the first element. 
					int compareAllPreviousElements=runningindex;//Then we compare selected element from array1 with all preceding elements from same array.
					while(compareAllPreviousElements>0) {		// If any match is found then we do not pass that element to next for loop for comparision with elements from array2.
						compareAllPreviousElements--;
						if(array1[runningindex]==array1[compareAllPreviousElements])
							count1++;
					}
				}
				if(count1==0) {
				for(int innerindex=0;innerindex<array2.length;innerindex++) {
					if(num==array2[innerindex]&& count<1) {
						System.out.print(num + " ");
						count++;
					}
				}
			}
		
		}
	}
		else 
			System.out.println("Length of two input arrays is not same hence cannot be compared.");
}

	public static void main(String []arg) {
		Findcommonelefrarray findcommonelefrarray = new Findcommonelefrarray();
		int[]inputarray1 = {1, 2, 0, 5, 7, 9, 11, 10};
		int[]inputarray2 = {1, 0, 6, 15, 6, 4, 7, 0};
		findcommonelefrarray.scanArray(inputarray1, inputarray2);
	}
}
