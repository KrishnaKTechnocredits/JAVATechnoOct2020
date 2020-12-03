package milind;

public class CountUpperCaseAndLowerCaseLetter {
	
	boolean upperAndLowerCaseCount(String input){
		int upperCount = 0, lowerCount = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				upperCount++;
			}else if(Character.isLowerCase(ch)) {
				lowerCount++;
			}
		}
		if(upperCount > lowerCount) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		String input = "TechnoCrediTS";
		String input1 = "MILIND";
		String input2 = "chavhan";
		CountUpperCaseAndLowerCaseLetter countUpperCaseAndLowerCaseLetter = new CountUpperCaseAndLowerCaseLetter();
		System.out.println(countUpperCaseAndLowerCaseLetter.upperAndLowerCaseCount(input));
		System.out.println(countUpperCaseAndLowerCaseLetter.upperAndLowerCaseCount(input1));
		System.out.println(countUpperCaseAndLowerCaseLetter.upperAndLowerCaseCount(input2));
	}

}
