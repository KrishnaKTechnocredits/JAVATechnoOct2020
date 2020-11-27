package surbhi;
class SimpleInterest{
	
	void calculateSimpleinterest(int principleAmount, float time, float rateOfInterest){
		float interest =(principleAmount * time * rateOfInterest) / 100;
		System.out.println("SimpleInterest is " +  interest);
	}
	public static void main(String[] args){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.calculateSimpleinterest(500,1.1f,8);
		
	}
}