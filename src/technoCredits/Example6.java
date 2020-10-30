package technoCredits;

// Student name, int mMarks, int pMarks, int cMarks
// mMarks > 90 ... pMarks >80 ... print cMarks 
// cMarks > 95 .. print mMarks ... print pMarks
// pMarks > 98 ... print mMarks.
// We have successfully processed student data

public class Example6 {
    
	void processData(String studentName, int mMarks, int pMarks, int cMarks){
		boolean flag = true;
		System.out.println("We are processing Student "+studentName+" data .....");
		if(mMarks > 90 && pMarks > 80) {
			System.out.println("CMarks is " + cMarks);
			flag = false;
		}else if(cMarks > 95) {
			System.out.println("MMarks is " + mMarks);
			System.out.println("PMakrs is " + pMarks);
			flag = false;
		}else if(pMarks > 98) {
	    	System.out.println("Mmarks is " + mMarks);
	    	flag = false;
		}
		
		if(!flag) // if(!flag)
			System.out.println("We have successfully processed student data");
	}
	
	public static void main(String[] args) {
		Example6 example2 = new Example6();
		example2.processData("Techno", 92 , 89, 93);
	}
}
