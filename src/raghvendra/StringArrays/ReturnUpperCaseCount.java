package raghvendra.StringArrays;
/*Program 1:  return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false*/
public class ReturnUpperCaseCount {
	void returnUpperCaseCountIfMore(String st) {
		int upperCount=0;
		int lowerCount=0;
		boolean flag=false;
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			int temp=(char)ch;
			if(temp>64 && temp<91)
				upperCount++;
			else if(temp>96 && temp<123)
				lowerCount++;
		}
		if(upperCount>lowerCount)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static void main(String[] args) {
		ReturnUpperCaseCount returnUpperCaseCount=new ReturnUpperCaseCount();
		String st="TechnoCrediTS";
		returnUpperCaseCount.returnUpperCaseCountIfMore(st);
		String st1="TeCHNOCrediTS";
		returnUpperCaseCount.returnUpperCaseCountIfMore(st1);
	}
}
