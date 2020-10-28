package tejashree;

public class Example3 {

	void test(String name) {
		int x = 20;
		if (x == 20 && name.equals("techno")) {
			System.out.println(x + x + "techno");
			System.out.println(x);
		} else
			System.out.println("we can do it ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example3().test("techno");
	}

}
