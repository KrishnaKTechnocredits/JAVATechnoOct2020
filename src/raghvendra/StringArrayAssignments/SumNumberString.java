package raghvendra.StringArrayAssignments;
/*Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */
public class SumNumberString {
	void sumAllNumberString(String st){
		String[] arr=st.split(" ");
		String givenString="";
		String sum="";
		int total=0;
		for(int index=0;index<arr.length;index++) {
			givenString=arr[index];
			for(int inner=0;inner<givenString.length();inner++) {
				char ch=givenString.charAt(inner);
				if(Character.isDigit(ch))
					sum+=ch;
				else if(sum!="") {
					total+=Integer.parseInt(sum);
					sum="";
				}
			}
		}
		if(sum!="") {
		total+=Integer.parseInt(sum);
		System.out.println("Sum of all numbers:"+total);
		}
		System.out.println("Sum of all numbers:"+total);
	}

	public static void main(String[] args) {
	SumNumberString sumNumberString=new SumNumberString();
	String st="I have 15 years and 2 months and 8 days of experience 1.";
	sumNumberString.sumAllNumberString(st);
	}
}
