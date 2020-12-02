package raghvendra.StringArrayAssignments;
/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/
public class SumDigitsInArray {
	void SumDigitsInString(String st){
		int sum=0;
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			if(Character.isDigit(ch))
				sum=sum+Character.getNumericValue(ch);
		}
		System.out.println("Sum of All numbers:"+sum);
	}

	public static void main(String[] args) {
		SumDigitsInArray sumDigitsInArray=new SumDigitsInArray();
		sumDigitsInArray.SumDigitsInString("te1ch9kj8");
	}
}
