package raghvendra;
/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32*/
public class FindDuplicate {
		void SearchDuplicate(int[] numbers) {
			int[] outerNumber=new int[numbers.length];
			int count=0;
			for(int index=1;index<numbers.length;index++) {
				outerNumber[index]=numbers[index];
				count=0;
				if(numbers[index]>0) {
					for(int inner=0;inner<numbers.length;inner++) {
						if(outerNumber[index]==numbers[inner]) {
							count++;
							numbers[inner]=0;
						}
					}
				if(count>1) 
				System.out.println("Duplicate numbers are: "+outerNumber[index]);
				}
			}
		}

	public static void main(String[] args) {
		FindDuplicate findDuplicate=new FindDuplicate();
		int[] arr = {10,12,55,32,17,12,32};
		findDuplicate.SearchDuplicate(arr);
	}

}
