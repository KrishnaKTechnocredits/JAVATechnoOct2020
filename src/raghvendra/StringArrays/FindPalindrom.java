package raghvendra.StringArrays;
/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/
public class FindPalindrom {
	void checkPalindromString(String st) {
		boolean flag=false;
		for(int index=0, lastIndex=st.length()-1;index<lastIndex;index++, lastIndex--) {
			char ch=st.charAt(index);
			char ch1=st.charAt(lastIndex);
			if(ch!=ch1) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println(st+" is not palindrom string");
		else
			System.out.println(st+" is palindrom string");
	}
	public static void main(String[] args) {
		FindPalindrom findPalindrom=new FindPalindrom();
		String st="naman";
		findPalindrom.checkPalindromString(st);
		String st1="techno";
		findPalindrom.checkPalindromString(st1);
		String st2="carrac";
		findPalindrom.checkPalindromString(st2);
	}
}
