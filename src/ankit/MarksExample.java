package ankit;

public class MarksExample {
	String studentName;
	int mathsMarks;
	int physicsMarks;
	int chemistryMarks;
	
	void setStudentMarks(String studentName, int mathsMarks, int physicsMarks, int chemistryMarks) {
		this.studentName=studentName;
		this.mathsMarks=mathsMarks;
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
	}
	
	void marksValidationAndDisplay(){
		System.out.println("We are processing " +studentName+ " data");
		if(mathsMarks>90 && physicsMarks>80)
			System.out.println("Chemistry marks is: "+chemistryMarks);
		else if(chemistryMarks > 95)
			System.out.println("Maths marks is: " + mathsMarks + " Physics Marks is: " +physicsMarks);
		else if (physicsMarks > 98)
			System.out.println("Maths marks is: " +mathsMarks);
	}
	
	public static void main(String[] args) {
		MarksExample marksExample = new MarksExample();
		marksExample.setStudentMarks("Ankit", 92, 79, 99);
		marksExample.marksValidationAndDisplay();
	}

}
