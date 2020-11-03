package monika;
class Student{

    String nameOfStudent;
	int marksGained;
	String grade;
  
    void studentName(String nameOfStudent){
	   this.nameOfStudent = nameOfStudent;
	  
	}

    void gainedMark(int marksGained){
	    this.marksGained = marksGained;
		
	}
	
	void studentCritera() {
		
		if(marksGained>=90)
			
			grade="A+";
			
		else if(marksGained>=80 && marksGained<90)
			
			grade="A";
			
		else if(marksGained>=70 && marksGained<80)
			
			grade="B+";
			
		else if(marksGained>=60 && marksGained<70)
			
			grade="B";	
			
		else if(marksGained<60)
			
			grade = "C";
	}
	
	void displayStudentReportCard(){
	
	   	System.out.println(nameOfStudent+" secured grade "+grade+ " in the exam");
	   
	}

   public static void main(String[] args) {
     Student student = new Student();
	 student.studentName("john");
	 student.gainedMark(90);
	 student.studentCritera();
	 student.displayStudentReportCard();
	 
	}
	
}
	
		  
	
	  











