package prem.codingExams;

/* Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi */

public class DuplicateFind {
	
	public static void main (String[] args) {
		int[] arr = {10,12,55,32,17,12,32};
		for (int i=0; i<arr.length; i++) { 
	            for(int j=i+1; j<arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                System.out.println("Duplicate Numbers are :" + arr[j]);
				        }
		}
	}
}

	