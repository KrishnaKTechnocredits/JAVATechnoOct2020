package raghvendra.staticNonStatic;

public class StaticNonStaticReturn {
	double sum(double x,double y,double z){
		double answer= (x+y+z);
		return answer;
	}
	
	double average(double x,double y,double z) {
		double answer=sum(x,y,z)/3;
		return answer;
	}
	
	static boolean isAnswerAboveExpecation(double answer){
		if (answer>50)
			return true;
		else 
			return false;
	}
	
	static boolean isEligible(double answer){
		if (answer>50 || answer%2==0)
			return true;
		else 
			return false;
	}
	
	static char getYourGrade(double answer){
		if (answer>80)
			return 'A';
		else 
			return 'B';
	}
	
	public static void main (String[] args) {
		StaticNonStaticReturn staticnonStaticReturn=new StaticNonStaticReturn();
		double avg=staticnonStaticReturn.average(40, 50, 60);
		boolean expectation=StaticNonStaticReturn.isAnswerAboveExpecation(avg);
		if (expectation==true)
			System.out.println("Student is above expectation");
		else
			System.out.println("Student is below expectation");
		boolean eligible=StaticNonStaticReturn.isEligible(avg);
		if (eligible==true)
			System.out.println("Student is eligible");
		else
			System.out.println("Student is not eligible");
		char grade=StaticNonStaticReturn.getYourGrade(avg);
		System.out.println("Student Grade is "+grade);
	}

}
