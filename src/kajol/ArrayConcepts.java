package kajol;

public class ArrayConcepts {
	
	int findMinNumber(int inputArray[]) {
		int min=inputArray[0];
		for(int index=1;index<inputArray.length;index++) {
			if(inputArray[index]<min)
				min=inputArray[index];
		}
		System.out.println("Minimum Number from given Array Elements: "+min);
		return min;	
	}
	
	int findMaxNumber(int inputArray[]) {
		int max=inputArray[0];
		for(int index=1;index<inputArray.length;index++) {
			if(inputArray[index]>max)
				max=inputArray[index];
		}
		System.out.println("Maximum Number from given Array Elements: "+max);
		return max;
	}
	
	float findAverage(int inputArray[]) {
		int sum=0;
		for(int index=0;index<inputArray.length;index++) 
			sum+=inputArray[index];
		return sum/inputArray.length;
	}
	
	void displayAllArrayElements(int inputArray[]) {
		System.out.print("Array Elements are: ");
		for(int index=0;index<inputArray.length;index++)
			System.out.print(inputArray[index]+" ");
	}
	
	void displayAllArrayElementsInReverseOrder(int inputArray[]) {
		System.out.println("");
		System.out.print("Array Elements in reverse order are: ");
		for(int index=inputArray.length-1;index>=0;index--)
			System.out.print(inputArray[index]+" ");
	}
	
	float findAverageOfMinandMax(int inputArray[]) {
		System.out.println("Average of Minimum and Maximum Number: "+findAverage(inputArray));
		return findAverage(inputArray);
		//return (findMaxNumber(inputArray)+findMinNumber(inputArray))/2;	
	}
	
	public static void main(String[] args) {
		ArrayConcepts arrayConcepts = new ArrayConcepts();
		int inputArray[]= {20,30,40,50,60};
		arrayConcepts.displayAllArrayElements(inputArray);
		arrayConcepts.displayAllArrayElementsInReverseOrder(inputArray);
		System.out.println("");
		System.out.println("Average of given Array Elements: "+arrayConcepts.findAverage(inputArray));
		int max=arrayConcepts.findMinNumber(inputArray);
		int min= arrayConcepts.findMaxNumber(inputArray);
		int minmaxArray[]= {min,max};
		arrayConcepts.findAverageOfMinandMax(minmaxArray);
	}
}
