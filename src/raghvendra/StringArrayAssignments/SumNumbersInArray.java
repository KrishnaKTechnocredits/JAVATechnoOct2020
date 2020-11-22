package raghvendra.StringArrayAssignments;
/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/
public class SumNumbersInArray {
	void SumDigitsInString(String st){
		String st1="";
		int b=1;
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
		System.out.println("Sum of numbers in string: "+st+" is:"+sum);
	}

	public static void main(String[] args) {
		SumNumbersInArray sumDigitsInArray=new SumNumbersInArray();
		sumDigitsInArray.SumDigitsInString("10te123ch9kj8");
	}
}
