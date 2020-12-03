package nagendra.logicalPrograms;

/*
Program 1: return a reserve number.
input : 1234
output : 4321
*/

public class ReverseNumber {

	void getReverseNumber(int number) {
		int revNumber = 0;
		while (number > 0) {
			int d = number % 10;
			revNumber = (revNumber * 10) + d;
			number = number / 10;
		}
		System.out.println("Reverse of Number is ->" + revNumber);
	}

	public static void main(String[] args) {

		ReverseNumber object = new ReverseNumber();
		int number = 1234;
		object.getReverseNumber(number);

	}

}
