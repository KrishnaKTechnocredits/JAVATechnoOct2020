package yogita;

class StudentInfo{
	   String name = "Yogita";
	   String middleName = "Mohan";
	   String surName = "Pawale";
	   String birthDate = "14 December 1995";
       String address = "D-103,Suvidha Apartment,JailRoad,Nashik";
	   int rollNumber = 1;
	   
	void studentName(){
	   System.out.println(" First Name of student is :"+name);
	   System.out.println(" Middle Name of student is :"+middleName);
    System.out.println(" SurName of student is :"+surName);
	}
	   
	void studentOtherDetails(){
	   System.out.println(" Birthdate Of student is :"+birthDate);
	   System.out.println(" Address Of student is :"+address);
	   System.out.println(" Roll Number Of student is :"+rollNumber);
    } 
	   
public static void main(String [] args){
	   StudentInfo studentInfo = new StudentInfo();
	   studentInfo.studentName();
	   studentInfo.studentOtherDetails();
    }
		   
 }                                                                                                                   
