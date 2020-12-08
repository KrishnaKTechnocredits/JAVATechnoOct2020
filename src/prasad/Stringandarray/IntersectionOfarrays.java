package prasad.Stringandarray;

import java.util.Arrays;

public class IntersectionOfarrays {
	
	double [] findCommonElements(double[]array1 , double []array2) {
		int tempOutputLength=0;	
		int tempOutputIndex=0;
		if(array1.length<array2.length) {
			tempOutputLength= array1.length;
		}
		else if(array2.length<array1.length || array2.length==array1.length) {
			tempOutputLength=array2.length;
		}
		double[] tempOutput = new double[tempOutputLength];
		for(int index=0;index<array1.length;index++) {
			double num = array1[index];
			int prevOccurOfSelecNum=0;
			if(index!=0) {
				int runningIndex=index;
				while(runningIndex>0) {
					runningIndex--;
					if(num==array1[runningIndex])
						prevOccurOfSelecNum++;
				}
			}
			if(prevOccurOfSelecNum==0) {
				for(int innerindex=0;innerindex<array2.length;innerindex++) {
					if(num==array2[innerindex]) {
						tempOutput[tempOutputIndex]=num;
						tempOutputIndex++;
						break; 
					}
				}
			}	
		}
		
		double intersectionElements [] = new double[tempOutputIndex];
		for(int index01=0; index01<tempOutputIndex;index01++) {
			intersectionElements[index01]=tempOutput[index01];
		}
			
		return intersectionElements;
	}
	
	public static void main(String[]arg) {
		IntersectionOfarrays intersectionOfarrays = new IntersectionOfarrays();
		double [] input1= {10.45,14.0,18.35,88.88,54.10,18.35};
		double [] input2 =  {17.20,13.30,10.45,18.35,84.33,13.30};
		double[]output = intersectionOfarrays.findCommonElements(input1, input2);
		System.out.println("Input01:- " + Arrays.toString(input1));
		System.out.println("Input02:- " + Arrays.toString(input2));
		System.out.println("Intersection of two input arrays:- " + Arrays.toString(output));
	}
}
