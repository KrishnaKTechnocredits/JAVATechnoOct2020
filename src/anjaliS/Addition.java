package anjaliS;

public class Addition {
	void add(int x, int y) {
		int z = x + y;
		System.out.println("Addition of two integers are: " + z);
	}

	void add(float x, float y) {
		float z = x + y;
		System.out.println("Addition of float numbers are:" + z);
	}

	void add(String x, String y) {
		String z = x + y;
		System.out.println("Addition of float numbers are:" + z);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(2, 3);
		addition.add(2.3f, 3.11f);
		addition.add("Anjali", "Shukla");

	}

}
