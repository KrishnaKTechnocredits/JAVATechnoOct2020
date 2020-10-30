package monika;
public class Loop {

	void divisible1(int start, int end) {
		System.out.println("--------------Even Number------------------");
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}

	}

	void divisibleby5(int start, int end) {
		System.out.println("-------------Divide By 5-------------------");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleby3(int start, int end) {
		System.out.println("-------------Divide by 5 and 3-------------------");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}

	void divisibleby7(int start, int end) {
		System.out.println("-------------Divide by 7 or 13-------------------" + "\n");
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}

	public static void main(String[] a) {
		Loop loop = new Loop();
		loop.divisible1(10, 15);
		loop.divisibleby5(10, 30);
		loop.divisibleby3(5, 18);
		loop.divisibleby7(5, 40);
	}
}