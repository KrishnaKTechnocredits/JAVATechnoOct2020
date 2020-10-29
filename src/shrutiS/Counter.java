package shrutiS;

public class Counter {
	static int counter=1;
	
	void incrementcounetr() {
		System.out.println(counter++);
		
	}
	
	public static void main(String[] a) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		
		counter1.incrementcounetr();
		counter2.incrementcounetr();
		counter3.incrementcounetr();
		
	}

}
