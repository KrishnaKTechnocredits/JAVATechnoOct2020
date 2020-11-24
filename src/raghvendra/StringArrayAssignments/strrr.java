package raghvendra.StringArrayAssignments;

public class strrr {
	void SumDigitsInString(String st){
		String st1="";
		int sum=0;
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			if(Character.isDigit(ch)) 
				st1+=ch;
			else if(st1!="") {
				sum+=Integer.parseInt(st1);
				st1="";
			}
		}
		sum+=Integer.parseInt(st1);
		System.out.println("Sum of numbers in string: "+st+" is:"+sum);
	}

	public static void main(String[] args) {
		strrr sumDigitsInArray=new strrr();
		sumDigitsInArray.SumDigitsInString("100te123ch9kj50");
	}
}
