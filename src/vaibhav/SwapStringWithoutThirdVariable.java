package vaibhav;

/*Program : 4 
swap 2 String without using 3rd variable
Hint : use SubString method of String class 
*/
public class SwapStringWithoutThirdVariable {
	
	public static void swap(String a,String b) {
		
		a=a+b;//jagtapvaibhav
		b=a.substring(0, a.length() -b.length());
		a=a.substring(b.length());
		System.out.println("After Swaping");
		System.out.println("String A : "+a+" String B : "+b);
	}

	public static void main(String[] args) {
		String a = "Jagtap";
		String b ="Vaibhav";
		System.out.println("Before Swaping");
		System.out.println("String A : "+a+" String B : "+b);
		SwapStringWithoutThirdVariable.swap(a,b);
	}

	
}
