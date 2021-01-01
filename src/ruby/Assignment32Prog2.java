package ruby;
/*Assignment 32: 3rd Dec'2020
 * Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/
public class Assignment32Prog2 {
	
	void printHiFor3Consecutive(int[] num) {
		for(int index=0; index<num.length-2;index++) {
			if(num[index+1] == num[index]+1 && num[index+2] == num[index]+2) {
				System.out.println(num[index]+", "+num[index+1]+", "+num[index+2]+"-> Hi");
			}
		}
	}

	public static void main(String[] args) {
		Assignment32Prog2 assign = new Assignment32Prog2();
		int[] input = {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		assign.printHiFor3Consecutive(input);

	}
}
