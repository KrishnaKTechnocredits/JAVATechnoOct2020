package vishakha.Asgnmt34;

public class PalindromeNumber {
	
	void verifyPalindromeNum(int num){
		int tempNum = num, n = 0, numRev = 0;
		while(num>0){
			n = num%10;
			numRev = numRev * 10 + n;
			num = num/10;			
		}
		if(numRev == tempNum)
			System.out.println(tempNum + " is a palindrome no");
		else
			System.out.println(tempNum + " is not a palindrome no");
	}

	public static void main(String[] args) {
		int num = 1122211;
		new PalindromeNumber().verifyPalindromeNum(num);
	}
}
