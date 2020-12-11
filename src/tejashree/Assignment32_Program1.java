package tejashree;

/*
return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/
public class Assignment32_Program1 {

	boolean isUppecaseCntMax(String str) {
		int upperCount = 0;
		int lowerCount = 0;
		boolean flag = false;
		System.out.println("Given String :" + str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				upperCount++;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				lowerCount++;
			}
		}
		if (upperCount > lowerCount)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Assignment32_Program1 assigment32_Program1 = new Assignment32_Program1();
		System.out.println("Uppercase letters greater than lower case letters ? "+ assigment32_Program1.isUppecaseCntMax("TechnoCrediTS"));
		System.out.println("Uppercase letters greater than lower case letters ? "+ assigment32_Program1.isUppecaseCntMax("TECHNnoCrediTS"));
	}
}
