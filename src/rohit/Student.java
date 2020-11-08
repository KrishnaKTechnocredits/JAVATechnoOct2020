package rohit;
public class Student {
	String name;

	void studentName(String name) {
		this.name = name;
	}

	void gainedMarks(int Percentage) {
		if (Percentage >= 90) {
			System.out.println(name + " : grade A+");
		} else if (Percentage >= 80 && Percentage < 90) {
			System.out.println(name + " : grade A");
		} else if (Percentage >= 70 && Percentage < 80) {
			System.out.println(name + " : grade B+");
		} else if (Percentage >= 60 && Percentage < 70) {
			System.out.println(name + " : grade B");
		} else {
			System.out.println(name + " : grade C");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.studentName("Rohit Rai");
		student.gainedMarks(65);
	}

}
