/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
 
 */



package deepak.assignment32;

public class Program2 {

	void processData1(int[] input) {
		
		for(int i=0; i<input.length; i++) {
			
			if(i < input.length -2) {
				if(input[i+1] == input[i]+1 && input[i+2] == input[i]+2) {
			System.out.println(input[i] +" "+ input[i+1] +" "+input[i+2]+" "+ "Hi");
			
				}
		}
	}
}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		
		Program2 refVar = new Program2();
		refVar.processData1(arr);
	}
}
