package nitin.Assignment_32;
/*Assignment 32: 3rd Dec'2020 - Program 1: return true if UpperCase characters count are more than LowerCase else return false.
input : TechnoCrediTS, output : false*/
public class Program1 {
	boolean conversionCase(String str) {
		System.out.println("Input String -->"+str);
		int upperCaseCount=0;
		int lowerCaseCount=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch>=65 && ch<=90)
				upperCaseCount++;
			else if(ch>=97 && ch<=122)
				lowerCaseCount++;
		}
		if(upperCaseCount>lowerCaseCount)
			return true;
	return false;
	}
	public static void main(String[] args) {
		Program1 program1=new Program1();
		String input="TechnoCrediTS";
		boolean count1=program1.conversionCase(input);
		System.out.println("Return -->"+count1);
	}
}
