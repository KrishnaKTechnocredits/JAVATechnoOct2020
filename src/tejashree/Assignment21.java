package tejashree;

public class Assignment21 {
	public static void main(String[]a){
		new Assignment21().checkArrayContent();
	}
	void checkArrayContent(){
		boolean flag=true;
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
						flag=false;
						break;
				}
			}
			if(flag){
				System.out.println("Arrays are Identical");
			}else
				System.out.println("Arrays are not identical");
			}else
				System.out.println("Please enter equal no of array elements in both arrays to be compared");

		}

}