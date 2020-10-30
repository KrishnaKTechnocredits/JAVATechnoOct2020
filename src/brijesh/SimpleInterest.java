package brijesh;
class SimpleInterest{
	void findInterest(int p, int t, int r){
		System.out.println("Interest: "+p*t*r/100);
	}
	public static void main(String[] args){
		SimpleInterest simpleInterest=new SimpleInterest();
		simpleInterest.findInterest(10000,2,6);
	}
}