package anjaliP;

public class AverageCalculation {
	static boolean flag;
	double sum(double x, double y, double z) {
		System.out.println("----Student Report Card-----"+"\n");
		System.out.println("Marks in English : "+x+"%"+"\n"+"Marks in Maths :"+y+"%"+"\n"+"Marks in Science : " 
		+z+"%"+"\n");
		return x + y + z;
	}
	double avg(double x, double y, double z) {
		AverageCalculation average = new AverageCalculation();
		return average.sum(x, y, z) / 3;
	}
	static boolean isAnsAboveExpectation(double avg) {
		
		if (avg > 50)
			return flag = true;
		else
			return flag = false;
	}
	static boolean isEligible(double avg) {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double avg) {
		if (avg > 80)
			return "Grade A";
		else
			return "Grade B";
	}
	public static void main(String[] args) {
		AverageCalculation averageCal = new AverageCalculation();
		double avg = averageCal.avg(95, 80, 85);
		System.out.println("---------Remarks-----------");

		if (isAnsAboveExpectation(avg))
			System.out.println("Your avg score is above expectation.Good Job!!!!");
		else
			System.out.println("You need to practice more");

		if (isEligible(avg))
			System.out.println("You are eligible ! Congrats...");
		else
			System.out.println("You are not eligible");

		String grade = getYourGrade(avg);
		System.out.println("You have received - " + grade);
	}
}