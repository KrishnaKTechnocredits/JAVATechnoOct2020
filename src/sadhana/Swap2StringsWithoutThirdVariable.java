package sadhana;
/* Assignment_20
 Swap two string without third variable
 */

public class Swap2StringsWithoutThirdVariable {
	void printData(String a,String b) {
		 System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);
	}
	public static void main(String args[]) { 
		Swap2StringsWithoutThirdVariable swap2StringsWithoutThirdVariable=new Swap2StringsWithoutThirdVariable();
		swap2StringsWithoutThirdVariable.printData("Sadhana","Pawar");         
    }  

}
