package anjaliS;

public class Student {
    String studentName;
	
    void studentName(String studentName){
	this.studentName = studentName;
  }
     void gainedMark(int marks){
     if(marks>90)
     System.out.println(studentName+ " GradeA+");

     if(marks>80 && marks<=90) 
     System.out.println(studentName+ " GradeA"); 
  
     if(marks>70 && marks<=80) 
     System.out.println(studentName+ " GradeB+");           

     if(marks>60 && marks<=70) 
     System.out.println(studentName+ " GradeB");

     if(marks<60) 
     System.out.println(studentName+ " GradeC");
  }
    public static void main(String[] args) {
 	   Student student = new Student();
       student.studentName("vinay");
       student.gainedMark(85);

  }

}
