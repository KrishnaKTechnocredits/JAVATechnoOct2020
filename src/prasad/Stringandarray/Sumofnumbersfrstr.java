package prasad.Stringandarray;

/*program 2 : sum of all numbers in a give string
input: te123ch9kj8
output : 123 + 9 + 8 = 140*/

public class Sumofnumbersfrstr {
	String temp0="0";
	String temp1="0";
	
	String [] scanstring(String word) {
		String []array = new String[word.length()];
		for(int i=0;i<word.length();i++) {
			array[i]="0";
		}
		int innerindex=0;
		for(int index=0 ; index<word.length(); index++) {
			char ch = word.charAt(index);
			if(Character.isDigit(ch)) {
				temp0 = temp0+ch;
				if(index==word.length()-1) {
					array[innerindex]=temp0;
				}
			}
			else if(Character.isAlphabetic(ch)) {
				if(innerindex<word.length()) {
					array[innerindex]=temp0;
					temp0 ="0";
					innerindex++;
				}
			}
		}
		return array;
	}
	
	int [] getNumbers(String[]arr) {
		int []numbers = new int [arr.length];		
		for(int index2=0;index2<arr.length;index2++) {
			if(arr[index2]!="0") {
			temp1=arr[index2];
			String numberst=temp1.substring(0);
			int number = Integer.parseInt(numberst);
			numbers[index2]=number;
		}
	}
		
		return numbers;
	}
	
	int sumOfNumbers(int[]numbers) {
		int sum=0;
		for(int index3=0;index3<numbers.length;index3++) {
			if(numbers[index3]>0) {
				sum=sum+numbers[index3];
			}
		}
		return sum ;
	}
	
	public static void main(String[]arg) {
		Sumofnumbersfrstr sumofnumbersfrstr = new Sumofnumbersfrstr();
		String word = "te123ch9kj8";
		String []array=sumofnumbersfrstr.scanstring(word);
		int [] numbers=sumofnumbersfrstr.getNumbers(array);
		int sum = sumofnumbersfrstr.sumOfNumbers(numbers);
		System.out.println("Sum of all whole numbers in given string " + word + " : " + sum);
	}
}
