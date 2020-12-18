package raghvendra.StringArrays;
/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> H*/
public class ReturnHiOnConsecTriplet {
	void trpReturnHiOnconsecNumber(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			if(index+2<=arr.length-1)
				if(arr[index]==(arr[index+1]-1) && arr[index]==(arr[index+2]-2))
					System.out.println(arr[index]+","+arr[index+1]+","+arr[index+2]+"--->Hi");
		}
	} 	
	public static void main(String[] args) {
		ReturnHiOnConsecTriplet returnHiOnConsecTriplet=new ReturnHiOnConsecTriplet();
		int[] arr= {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		returnHiOnConsecTriplet.trpReturnHiOnconsecNumber(arr);
	}
}
