package anjaliP;

public class SimpleInterest {

	void simpleInterest(int amt,int time,double rate) {
		double simpleInt = (amt*time*rate);
		System.out.println("Ammount of "+amt+" for "+time+
				" years its Simplete Interest rate will be : "+simpleInt); 
	}
	public static void main(String[]a) {
		SimpleInterest simpleIntVal = new SimpleInterest();
		simpleIntVal.simpleInterest(12000, 2, 12.5);
	}
}
