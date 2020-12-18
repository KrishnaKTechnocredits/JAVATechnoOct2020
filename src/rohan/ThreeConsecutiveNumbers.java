package rohan;
/*
Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
 */

public class ThreeConsecutiveNumbers {

		public static void main(String[] args) {
			ThreeConsecutiveNumbers tc = new ThreeConsecutiveNumbers();
			int[] numArr = {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
			tc.findThreeConsecutiveNumbers(numArr);
		}
		
		void findThreeConsecutiveNumbers(int[] numArr) {
			String tmpStr="";
			for(int index=0;index<numArr.length-2;index++) {
				if(numArr[index+1]==numArr[index]+1 && numArr[index+2]==numArr[index]+2)
					System.out.println(numArr[index]+","+numArr[index+1]+","+numArr[index+2]+" --> Hi");
			}
		}
}
