package prasad.Stringandarray;

/*Program 1: return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/

public class Checkupperandlowercasecount {
	int upperCount;
	int lowerCount;
	
	boolean isUppercaseCountmore(String input) {
		boolean flag = false;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch>=65&&ch<=90) {
				upperCount++;
			}
			else if(ch>=97&&ch<=122) {
				lowerCount++;
			}
		}
		if(upperCount>lowerCount)
			flag = true;
		
		return flag;
	}
	
	public static void main(String[]arg) {
		Checkupperandlowercasecount checkupperandlowercasecount = new Checkupperandlowercasecount();
		String input= "TechnoCrediTS";
		System.out.println("Input String:- "+ input);
		boolean flag = checkupperandlowercasecount.isUppercaseCountmore(input);
		if(flag) {
			System.out.println("Is upper case count more than lower case count?:- True");
			System.out.println("Count of chars in upper case:- " +checkupperandlowercasecount.upperCount + " ; " + "Count of chars in upper case:- " +checkupperandlowercasecount.lowerCount);
		}else {
			System.out.println("Is upper case count more than lower case count?:- False" );
		    System.out.println("Count of chars in upper case:- " +checkupperandlowercasecount.upperCount + " ; " + "Count of chars in upper case:- " +checkupperandlowercasecount.lowerCount);
		}
	}

}
