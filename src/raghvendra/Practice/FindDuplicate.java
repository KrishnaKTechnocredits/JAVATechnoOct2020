package raghvendra.Practice;
//3)  find duplicate number. [exptected time 15 mins]

public class FindDuplicate {
	void findDupes(int[] arr) {
		int count=0;
		System.out.println("Duplicate numbers are: ");
		for(int index=0;index<arr.length;index++) {
			count=0;
			for(int inner=index+1;inner<arr.length;inner++) {
				if(arr[index]==arr[inner]) {
					if(index>inner)
						break;
					else
						count++;
				}
			}
			if(count>0)
				System.out.print(arr[index]+" ");
		}
	}
	public static void main(String[] args) {
		FindDuplicate findDuplicate=new FindDuplicate();
		int[] arr= {10,20,10,30,40,-1,0,0,30,5};
		findDuplicate.findDupes(arr);

	}

}
