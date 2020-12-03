package brijesh.assignment32;
/*
return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/
public class Program1 {
	
	public void upperCaseLowerCase(String string) {
		System.out.println("Given String: "+string);
		int upperCount=0, lowerCount=0;
		for(int index=0; index<string.length(); index++) {
			if(Character.isUpperCase(string.charAt(index)))
				upperCount++;
			else if(Character.isLowerCase(string.charAt(index)))
				lowerCount++;
		}
		System.out.println("Is uppercase count is greater than lowercase count: "+(upperCount>lowerCount));
		System.out.println("*********************************************************");
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.upperCaseLowerCase("TeCHNoCrEdiTs2020");
		program1.upperCaseLowerCase("ahhdhAhd2020");
	}
}
