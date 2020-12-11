package raghvendra.StringArrays;
/*Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/
public class UpperToLowerAscii {
	void upperToLowerUsingAscii(String st) {
		String word="";
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			int temp=ch;
			if(temp>64 && temp<97) {
				temp=temp+32;
				ch=(char)temp;
				word=word+ch;
			}
			else if(temp>96 && temp<129) {
				ch=(char)temp;
				word=word+ch;
			}
		}
		System.out.println("Given String= "+st);
		System.out.println("Converted String= "+word);
	}
	public static void main(String[] args) {
		UpperToLowerAscii upperToLowerAscii=new UpperToLowerAscii();
		String st="TechnoCreditS";
		upperToLowerAscii.upperToLowerUsingAscii(st);
		String st1="aechnoCreditZ";
		upperToLowerAscii.upperToLowerUsingAscii(st1);
		}
}
