package darshana;

public class Student{
String studname=null;
int marks=91;

void StudentName(){
    studname="darshana";
    
    gainedMarks();
}

void gainedMarks(){
    if(marks>90){
    System.out.println(studname+ " has gained A+ grade with "+marks+"%");
    }
    else if (marks >= 80 && marks <=90){
        System.out.println(studname+ " has gained A grade with "+marks+"%");
    }
     else if (marks >= 70 && marks <=79){
        System.out.println(studname+ " has gained B+ grade with "+marks+"%");
    }
     else if (marks >= 60 && marks <=69){
        System.out.println(studname+ " has gained B grade with "+marks+"%");
    }
     else if (marks < 60){
        System.out.println(studname+ " has gained C grade with "+marks+"%");
    }
    
}


     public static void main(String []args){
        Student s=new Student();
        s.StudentName();
     }
}