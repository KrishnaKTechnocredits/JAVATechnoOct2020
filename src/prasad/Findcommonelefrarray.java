package prasad;

public class Findcommonelefrarray {
	void scanArray(int[]array1 , int[]array2) {
		if(array1.length!=array2.length)
			System.out.println("Given two arrays are not of same length, please retry");
		else
			System.out.println("Common Elements:- ");
		for(int index=0;index<array1.length;index++) {
			if(array1.length != array2.length)
				break; 
			
			if(array1[index]==array2[index])
				System.out.print(array1[index] + " ");
		}
		
	}
	
	public static void main(String []arg) {
		Findcommonelefrarray findcommonelefrarray = new Findcommonelefrarray();
		int[]inputarray1 = {1, 2, 5, 1, 0, 8, 7, 10};
		int[]inputarray2 = {1, 0, 6, 15, 6, 4, 7, 0};
		findcommonelefrarray.scanArray(inputarray1, inputarray2);
	}
}
