package milind;

public class Student {
	
	String name;
	
	void studentName(String name) {
		this.name = name;
	}
	
	void gainedMark(double marksInPercentage) {
		if(marksInPercentage >= 90) {
			System.out.println(name + " : grade A+");			
		} else if(marksInPercentage < 90 && marksInPercentage >= 80) {
			System.out.println(name + " : grade A");
		} else if(marksInPercentage < 80 && marksInPercentage >= 70) {
			System.out.println(name + " : grade B+");
		} else if(marksInPercentage < 70 && marksInPercentage >= 60) {
			System.out.println(name + " : grade B");
		} else {
			System.out.println(name + " : grade C");
		}
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Milind");
		student.gainedMark(59.5);
	}

}
