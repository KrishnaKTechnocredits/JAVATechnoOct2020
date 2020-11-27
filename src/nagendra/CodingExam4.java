package nagendra;

/*Program 1: WAP to Find Common Element Between Two Arrays
input: 
int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]
output: 1 7
*/


public class CodingExam4 {

	void getCommonElement(int[] input,int[] input2) {
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input2.length;j++){
				if(input[i]==input2[j]  ){
					System.out.println("Common :"+input[i]);
					break;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		CodingExam4 object = new CodingExam4();
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		object.getCommonElement(array1, array2);
	}
}
