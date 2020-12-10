
/*
 Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
 */

public class CharacterCount {
	
	public static void main(String[] args) {
		CharacterCount characterCount = new CharacterCount();
		String s = "TecHNOCrEdiTS";
		boolean flag = characterCount.findCount(s);
		System.out.println("return true if UpperCase characters count are more than lowercase else return false");
		System.out.println("Input String: "+s);
		System.out.println("Output: "+flag);
	}
	
	boolean findCount(String s) {
		int uCount=0,lCount=0,ascii=0;
		for(int index=0;index<s.length();index++) {
			ascii = s.charAt(index);
			if(ascii>=65 && ascii<=90)
				uCount++;
			else if(ascii>=97 && ascii<=122)
				lCount++;
		}
		if(uCount > lCount)
			return true;
		else
			return false;
	}
}
