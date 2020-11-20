package rohit;

public class WhileLoop {
	void evennumber(int start, int end) {
		System.out.println("Even Numbers::");
		int index = start;
		while (index <= end) {
			if (index % 2 == 0)
				System.out.println(index);
			index++;
		}
	}

	void divby5(int start, int end) {
		System.out.println("Number divisible by 5::");
		int index = start;
		while (index <= end) {
			if (index % 5 == 0)
				System.out.println(index);
			index++;
		}
	}

	void divby5and3(int start, int end) {
		System.out.println("Number divisible by 5 and 3::");
		int index = start;
		while (index <= end) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
			index++;
		}
	}

	void divby7and13(int start, int end) {
		System.out.println("Number divisible by 7 and 13::");
		int index = start;
		while (index <= end) {
			if (index % 7 == 0)
				System.out.println("Number divisible by 7= " + index);
			else if (index % 13 == 0)
				System.out.println("Number divisible by 13= " + index);
			index++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop whileloop = new WhileLoop();
		whileloop.evennumber(10, 15);
		whileloop.divby5(10, 30);
		whileloop.divby5and3(5, 18);
		whileloop.divby7and13(5, 40);
	}

}
