package himali;

public class Assignment7 {

	void evenNumber(int start, int end) {
		System.out.println("Even numbers are: ");
		for (int i = start; i <= end; i++) {

			if (i % 2 == 0)
				System.out.println(i);

		}

	}

	void numberDivisibleBy5(int start, int end) {
		System.out.println("Number divisible by 5 are :");
		for (int i = start; i <= end; i++) {

			if (i % 5 == 0)
				System.out.println(i);

		}

	}

	void numberDivisibleBy5And3(int start, int end) {
		System.out.println("Number divisible by 5 and 3 are :");
		for (int i = start; i <= end; i++) {

			if (i % 5 == 0 && i%3==0)
				System.out.println(i);

		}

	}

	void numberDivisibleBy7Or13(int start, int end) {
		System.out.println("Number divisible by 7 or 13 are :");
		for (int i = start; i <= end; i++) {

			if (i % 7 == 0) 
				System.out.println(i +" is divisible by 7");
			if(i%13==0)
				System.out.println(i +" is divisible by 13");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment7 assignment7 = new Assignment7();
		assignment7.evenNumber(10, 15);
		assignment7.numberDivisibleBy5(10, 30);
		assignment7.numberDivisibleBy5And3(5, 18);
		assignment7.numberDivisibleBy7Or13(5, 40);

	}

}
