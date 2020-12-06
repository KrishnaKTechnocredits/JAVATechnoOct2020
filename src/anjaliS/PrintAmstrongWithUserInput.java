package anjaliS;

public class PrintAmstrongWithUserInput {
	void displayAmstrongNumber(int number) {
		int sum = 0, rem = 0;
		int ams = number;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			sum = sum + (rem * rem * rem);
		}
		if (ams == sum)
			System.out.println("This is an armstrong number");
		else
			System.out.println("This is not an armstrong number");
	}

	public static void main(String[] args) {
		PrintAmstrongWithUserInput printamstrongwithuserinput = new PrintAmstrongWithUserInput();
		printamstrongwithuserinput.displayAmstrongNumber(154);
		printamstrongwithuserinput.displayAmstrongNumber(153);

	}

}
