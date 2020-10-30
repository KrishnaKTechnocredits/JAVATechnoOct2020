package brijesh;
class SimpleInterest{
	void findInterest(int principalAmount, int termInYears, int rateOfInterest){
		System.out.println("Interest: "+principalAmount*termInYears*rateOfInterest/100);
	}
	public static void main(String[] args){
		SimpleInterest simpleInterest=new SimpleInterest();
		simpleInterest.findInterest(10000,2,6);
	}
}