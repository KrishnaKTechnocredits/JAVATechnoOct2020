package technoCredits.loop;

public class Example4 {

	void display() {
		int x = 10;
		int sum=0;
		for (int index = 10; index >= 1; index--) {
			sum = 0;
			if (index % 7 == 0 || index % 3 == 0) {
				System.out.println("Index is : " + index);
			}
			sum = sum + index;
			if (sum > 22)
				break;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Example4().display();
		System.out.println("End");
	}
}
