package prasad;

public class Gradecalculation {

	double avg(double number1,double number2,double number3){
		System.out.println("Student marks: " + "Physics: "+ number1 + ", Chemistry: "+ number2+", Maths: "+number3);
		double sumanswer= sum(number1,number2,number3);
		double avgans = sumanswer/3;
		return avgans;
	}
	
	double sum(double number1,double number2,double number3) {
			double sumanswer = (number1+number2+number3);
			return sumanswer;
	}
	
	static boolean isAnswerAboveExpecation(double avg) {
		if (avg>50)
			return true;
		else 
			return false;
	}
	
	static boolean isEligible(double avg) {
		if(avg>50 || avg%2==0)
			return true;
		else 
			return false;
	}
	
	static String getYourGrade(double avg) {
		if(avg>80)
			return "A grade";
		else
			return "B grade";
	}
	
	public static void main (String[]arg) {
		Gradecalculation gradecalculation = new Gradecalculation();
		double avgans= gradecalculation.avg(78,82,85);
		System.out.println("Average marks: " + avgans);
		boolean flag0 = Gradecalculation.isAnswerAboveExpecation(avgans);
		System.out.println("Are average marks above expectation: " + flag0);
		boolean flag1 = Gradecalculation.isEligible(avgans);
		System.out.println("Is eligible? : " + flag1);
		String grade = Gradecalculation.getYourGrade(avgans);
		System.out.println("Student grade based on average marks: "+grade);
	}

}
