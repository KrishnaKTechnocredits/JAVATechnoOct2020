//Find second maximum from array without sorting the array

package Himali_Assignment_29;

public class findSecMaxNum {
	void findSecMaxNumFromArray(int[] array){
		int firstMax=0;
		int secondMax=0;
		
			for(int i=0;i<=array[i];i++) {
				if(array[i]>firstMax) {
					secondMax=firstMax;
					firstMax=array[i];
					
				}
				
			}
			System.out.println("Second max number is : "+secondMax);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSecMaxNum secNum=new findSecMaxNum();
		int[] num= {3,7,5,9,1,7};
		
		secNum.findSecMaxNumFromArray(num);

	}

}
