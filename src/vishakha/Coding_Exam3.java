/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi*/

package vishakha;

public class Coding_Exam3 {
	
	void checkRepeatingNos(int[] arr){		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	void checkRepeatingWords(String[] arr){		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
						System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Coding_Exam3 coding_Exam3 = new Coding_Exam3();
		int[] arrInt = {10,12,55,32,17,12,32};
		String arrWord[] = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		coding_Exam3.checkRepeatingNos(arrInt);
		coding_Exam3.checkRepeatingWords(arrWord);
	}
}
