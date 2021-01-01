/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno

Program 2: print all the words where digit sum is > 10. 
*/

package anurag;

public class Assignment27 {

	void findWordWithoutDigit(String ar[]) {
		
		for (int i = 0; i < ar.length; i++) {
			int flag = 0;
			for (int j = 0; j < ar[i].length(); j++) {
				if (Character.isDigit(ar[i].charAt(j))) {
					flag = 1;
				}
			}

			if (flag == 0)
				System.out.println(ar[i]);
		}

	}

	
	void findWordWithSumGT10(String ar[]){
		
		for(int i = 0; i< ar.length; i++) {
		int sum = 0;
		String digit = "";
		for (int index = 0; index < ar[i].length(); index++) {
			char ch = ar[i].charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (digit.length() > 0) {
				sum += Integer.parseInt(digit);
	//			System.out.println(digit);
				digit = "";
			}
		}
		if (digit.length() > 0) {
			sum =sum + Integer.parseInt(digit);
		}
		if(sum>10)
		System.out.println(ar[i] + ": sum of digits is " + sum);

		}
	}
	public static void main(String[] args) {

		Assignment27 assignment27 = new Assignment27();
		
		String input1[] = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		
		System.out.println("Output of Program 1:");
		
		assignment27.findWordWithoutDigit(input1);
		
		System.out.println();
		
		System.out.println("Output of Program 2:");
		
		String input2[] = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		
		assignment27.findWordWithSumGT10(input2);

	}

}
