package monika;
/*Assignment-20 :
Program : 3
swap 2 String with using 3rd variable


*/

public class SwapStringWithThirdVariable {

	public static void swap(String name,String sirName) {
		String temp="";
		temp = name;
		name = sirName;
		sirName =temp;	
		System.out.println("After Swaping");
		System.out.println("First name : "+name+" Last Name : "+sirName);		
	}

	public static void main(String[] args) {
		String name = "sethi";
		String sirName ="Monika";
		System.out.println("Before Swaping");
		System.out.println("First name : "+name+" Last Name : "+sirName);
		SwapStringWithThirdVariable.swap(name,sirName);
	}
}