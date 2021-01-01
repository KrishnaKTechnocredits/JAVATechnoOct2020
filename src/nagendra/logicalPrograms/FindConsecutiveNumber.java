package nagendra.logicalPrograms;

/*
Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
*/
public class FindConsecutiveNumber {
	
	
	void getconsecutiveNumber(int[] input){
		
		for(int i=0;i<input.length-2;i++){
			int number=input[i];
			if(input[i+1]==number+1 &&input[i+2]==number+2){
				System.out.println(""+input[i]+","+input[i+1]+","+input[i+2]+" ->Hi");
			}
		}
	}

	public static void main(String[] args) {
		FindConsecutiveNumber object =new FindConsecutiveNumber();
		int[] input={1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		object.getconsecutiveNumber(input);
	}
}
