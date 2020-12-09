package prasad.Stringandarray;

import java.util.Arrays;

public class UnionOfArrays {
	
	double[] tempUnion(double[]array1, double[]array2) {     /*This methods constructs union of given two
														      arrays with extra 0's in the output array*/
		int tempArrayLength= array1.length+array2.length;
		int tempIndex=array1.length;
		double[]tempArray = new double[tempArrayLength];
		
		for(int index=0;index<array1.length;index++) {
			double num = array1[index];
			int count=0;
			if(index!=0) {
			for(int innerindex= index;innerindex>=0;innerindex--) {
				if(num==array1[innerindex]&&index!=innerindex)
					count++;
			}
			if(count==0) {
				tempArray[index]=num;
		}
			
		}
			if(index==0) {
				tempArray[index]=array1[index];
			}
	}
		for(int index=0;index<array2.length;index++) {
			double num= array2[index];
			int count=0;
			for(int innerindex=0;innerindex<tempArrayLength;innerindex++) {
				if(num==tempArray[innerindex]) {
					count++;
				}
			}
			if(count==0) {
				tempArray[tempIndex]=num;
				tempIndex++;
			}	
		}
		
		return tempArray;
	}
	
	int finddistinctelements(double[]array) {   /*this method finds count of unique elements from the array containing
												  union of two arrays with additional 0's*/
		int distinctelements = 0;
		for(int index=0;index<array.length;index++) {
			double num=array[index];
			int count=0;
			for(int innerindex=0;innerindex<array.length;innerindex++) {
				if(index!=innerindex && num==array[innerindex])
					count++;
			}
			if(count==0)
				distinctelements++;
		}
		
		return distinctelements; 
	}
	
	double [] union (double[]array,int length) {	/*this method accepts union of two arrays with additional 0's
													 & using count of distinct elements in the same array creates 
													 resultant array with length = count of distinct and then only pushes
													 unique elements from input array into resultant array which is actual union
													 of two given arrays*/
		double [] union = new double[length];
		int unionIndex=0;
		for(int index=0;index<array.length;index++) {
			double num=array[index];
			int count=0;
			for(int innerindex=0;innerindex<array.length;innerindex++) {
				if(index!=innerindex && num==array[innerindex])
					count++;
			}
			if(count==0) {
				union[unionIndex]=num;
				unionIndex++;
			}
		}
		
		return union;
	}
	
	public static void main(String[]arg) {
		UnionOfArrays unionofarrays = new UnionOfArrays();
		double [] input1= {10.45,14.0,18.35,88.88,54.10,18.35};
		double [] input2 =  {17.20,13.30,10.45,18.35,84.33,13.30};
		System.out.println("Input01:- " + Arrays.toString(input1));
		System.out.println("Input02:- " + Arrays.toString(input2));
		double [] tempunion = unionofarrays.tempUnion(input1, input2);
		int unionarraylength= unionofarrays.finddistinctelements(tempunion);
		double union[]=unionofarrays.union(tempunion, unionarraylength);
		System.out.print("Union of given 2 arrays:- " + Arrays.toString(union));
		
	}

}