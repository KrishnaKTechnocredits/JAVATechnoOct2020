package himali;

public class Assignment11 {

	
	double sum(double x,double y,double z) {
		return x+y+z;
		
	}
	double average(double x,double y,double z) {
		Assignment11 assignement11=new Assignment11();
		double answer=assignement11.sum(x, y, z)/3;
		return answer;
	}
	
	static boolean isAnswerAboveExpecation(double answer){
		if(answer>50)
			return true;
		else
			return false;
	}
	static String isEligible(double answer) {
		if(answer>50 || answer%2==0) {
			return "Student is eligible";
		}
		else
			return "Student is not eligible";
	}
	
	static String getYourGrade(double answer) {
		if(answer>80)
			return "Student got A grade";
		else
			return "Student got B Grade";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment11 assignemnt11=new Assignment11();
		double avg=assignemnt11.average(10,20,30);
		boolean b=isAnswerAboveExpecation(avg);
		System.out.println(isEligible(avg));
		System.out.println(getYourGrade(avg));
		
		

	}

}
