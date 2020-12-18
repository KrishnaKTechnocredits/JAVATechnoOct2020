package suresh;
// return a reserve number.
public class ReverseNumber {
	 static String data;

	void reverseNumber(int data) {
		System.out.println("Before Reversal:->"+data);
		int  reversed = 0;
		while(data!=0) {
			int digit = data % 10;
            reversed = reversed * 10 + digit;
            data /= 10;
		}
		System.out.println("Reversed Number:-> " + reversed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReverseNumber reversenumber = new ReverseNumber();
		reversenumber.reverseNumber(1234);
	}

}
