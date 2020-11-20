package raghvendra.Practice;
//2)  verify number is Prime number [expected time 10 mins]
public class VerifyPrimt {
	void checkPrime(int number) {
		boolean b=false;
		for(int index=2;index<=Math.sqrt(number);index++) {
			if(number%index==0) {
				b=true;
				break;
			}
			
		}
		if(b)
			System.out.println(+number+" is not Prime number");
		else
			System.out.println(+number+" is Prime number");
	}
	public static void main(String[] args) {
		VerifyPrimt verifyPrimt=new VerifyPrimt();
		verifyPrimt.checkPrime(79);
		verifyPrimt.checkPrime(7);
		verifyPrimt.checkPrime(81);
		verifyPrimt.checkPrime(139);
		verifyPrimt.checkPrime(4);
		verifyPrimt.checkPrime(2);
	}

}
