 /*
 WAP to find given 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical*/

package vishakha;

public class FindArrayIdentical {
	
	void findIdenticalArray(){
		boolean flag = true;
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,99,32,17};
		if(arr1.length == arr2.length){
			for(int index=0; index<arr1.length; index++){
				for(int innerIndex=0; innerIndex<arr2.length; innerIndex++){
					if(arr1[index] != arr2[index]){
						flag = false;
						break;
					}
				}
			}
			if(!flag)
				System.out.println("Arrays are not identical");
			else
				System.out.println("Arrays are identical");
		}else
			System.out.println("Arrays are not identical");
	}

	public static void main(String[] args) {
		new FindArrayIdentical().findIdenticalArray();
	}
}
