package yogita;

class StudentData
{
    void processData(String name , int mMarks , int pPmarks, int cCmarks) {
  
	  System.out .println("we are proccessing "+name+ "'s" + " data");
	  System.out.println("Name " +name+ " Maths Marks: " +mMarks+ " Checm Marks " +cCmarks+ " physics Marks " +pPmarks);
      boolean flag = true;
	    if(mMarks > 90 && pPmarks >80) {
	      System.out.println("Chemistry marks :" +cCmarks);
	      flag =false;
      }
	    else if(cCmarks > 95) {
	      System.out.println("physics marks :" +pPmarks);
	      System.out.println("maths marks :" +mMarks);
	  	  flag =false;
      }
	   else if(pPmarks >98){
	   	  System.out.println("maths marks :" +mMarks);
		   flag =false;
      }
	    
	   if(!flag) {
	      System.out.println("Successfully processd data");
	  }
      } 
	 
  public static void main(String [] args) {
		StudentData studentData = new StudentData();
        studentData.processData("Yogita",92,89,93);
	  }
  }
	