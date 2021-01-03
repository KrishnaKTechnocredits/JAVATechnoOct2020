package nitin;
/* Assignment : 43 [23rd Dec'2020] - WAP to sum numbers from below String,
input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9*/
public class SumNumbersInString {
	public void numberSumInString(String str) {
		System.out.println("Input String :: "+str);
		String[] splitted=str.split(" ");
		double sum=0;
		for(int index=0; index<splitted.length;index++) {
			char ch=splitted[index].charAt(0);
			if(Character.isDigit(ch)) {
				double num=Double.parseDouble(splitted[index]);
				sum+=num;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		SumNumbersInString sumNumbersInString = new SumNumbersInString();
		sumNumbersInString.numberSumInString("I have 5.6 years of exp in automation and 2.3 in manual testing.");
	}
}
