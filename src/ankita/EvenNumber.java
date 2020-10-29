package ankita;

public class EvenNumber {

	void prinEvenNumber(int start,int end) {
		
		System.out.println("Even Numbers between "+ start +"&"+end);
		for(int i=start; i<=end; i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new EvenNumber().prinEvenNumber(10, 15);
	}
}
