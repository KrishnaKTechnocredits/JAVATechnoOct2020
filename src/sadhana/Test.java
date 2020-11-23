package sadhana;

class Test {

	double sum(double topic1, double topic2, double topic3) {
		double totalMarks = topic1 + topic2 + topic3;
		System.out.println("Total marks obtained on all three topics = " + " " + totalMarks);
		return totalMarks;
	}

	double average(double topic1, double topic2, double topic3) {
		Test test = new Test();
		double avg = test.sum(topic1, topic2, topic3) / 3;
		System.out.println("Average of three topics = " + " " + avg);
		return avg;
	}

	static boolean isAnswerAboveExpecation(double avg) {

		if (avg > 50)
			return true;
		else
			return false;
	}

	static String isEligible(double avg) {

		if (avg > 50 || avg / 2 == 0)
			return "Eligible";
		else
			return "Not eligible";
	}

	static String getYourGrade(double avg) {

		if (avg > 80)
			return "Grade is A";
		else
			return "Grade is B";
	}

	public static void main(String[] args) {
		Test test = new Test();
		double average = test.average(98.35, 86.75, 61.43);
		System.out.println("Answered all the topics above expections");
		Test.isAnswerAboveExpecation(average);
		System.out.println(isEligible(average));
		System.out.println(getYourGrade(average));

	}

}
