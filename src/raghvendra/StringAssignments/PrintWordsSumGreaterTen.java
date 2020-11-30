package raghvendra.StringAssignments;
/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
public class PrintWordsSumGreaterTen {
	void printStringGreaterTen(String[] st) {
		int sum;
		System.out.println("Words with sum of numbers greater than 0 are: ");
		for(int index=0;index<st.length;index++) {
			String word=st[index];
			sum=0;
			for(int inner=0;inner<word.length();inner++) {
				char ch=word.charAt(inner);
				if(Character.isDigit(ch))
					sum+=Character.getNumericValue(ch);
			}
			if(sum>10)
				System.out.println(st[index]);
		}
	}

	public static void main(String[] args) {
		PrintWordsSumGreaterTen printWordsSumGreaterTen=new PrintWordsSumGreaterTen();
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		printWordsSumGreaterTen.printStringGreaterTen(input);
		String[] input1 = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk","wer589"};
		printWordsSumGreaterTen.printStringGreaterTen(input1);
	}

}
