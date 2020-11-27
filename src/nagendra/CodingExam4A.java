package nagendra;

/*Program 2: WAP to find two String are identical or not
input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";
output 1: both string are not identical
input 2:
String s1 = "pune";
String s2 = "pune";
output 2: both string are identical
*/

public class CodingExam4A {
	
	void getIdenticalString(String userInput, String input) {
		boolean flag = true;
		char[] input1=userInput.toLowerCase().toCharArray();
		char[] input2=input.toLowerCase().toCharArray();
       for(int i=0;i<input1.length;i++){
    	   for(int j=i;j<=i;j++){
    		   if(input1[i]!=input2[j]){
    			   flag=false;
    		   }
    	   }
       }
   	if (flag)
		System.out.println("Both String are Identical");
	else {
		System.out.println("Both String are Not identical");

		}
	}
	public static void main(String[] args) {
		CodingExam4A object = new CodingExam4A();
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		object.getIdenticalString(s1, s2);
		
	}

}
