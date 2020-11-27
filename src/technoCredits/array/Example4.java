package technoCredits.array;

public class Example4 {
	
	int y = 20;
	
	void processData(int num) {
		num = num + 10;
		y = num + 10;
		System.out.println(y); // 30
	}
	
	
	public static void main(String[] args) {
		int num = 20;
		Example4 example4 = new Example4();
		example4.y = 30;
		example4.processData(num);
		//System.out.println(num); // 30
		System.out.println(example4.y); // 40
	}
}
