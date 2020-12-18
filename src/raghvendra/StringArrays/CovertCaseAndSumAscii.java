package raghvendra.StringArrays;
/*Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/
public class CovertCaseAndSumAscii {
	void ConvertCaseAndDoSum(String st) {
		String word="";
		int sum=0;
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			int temp=ch;
			if(temp>64 && temp<97) {
				temp=temp+32;
				ch=(char)temp;
				word=word+ch;
			}
			else if(temp>96 && temp<129) {
				temp=temp-32;
				ch=(char)temp;
				word=word+ch;
			}
			else if(temp>47 && temp<58) 
				sum+=Character.getNumericValue(ch);
		}
		System.out.println("Given String= "+st);
		System.out.println("Converted String= "+sum+word);
	}
	public static void main(String[] args) {
		CovertCaseAndSumAscii covertCaseAndSumAscii=new CovertCaseAndSumAscii();
		String st= "Te1ch8n9oC6reDi5TS1";
		covertCaseAndSumAscii.ConvertCaseAndDoSum(st);
	}
}
