package nandini;

public class ReverseNumber {
	
	void printReversedNumber(int num) {
		int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed Number: " + reversed);
	}
   public static void main(String args[]) {
	   new ReverseNumber().printReversedNumber(1234);
   }
}
