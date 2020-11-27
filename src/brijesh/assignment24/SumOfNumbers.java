package brijesh.assignment24;

public class SumOfNumbers {
	
	void sumOfAllNumbers(String string) {
		String temp="";
		int sum=0;
		for(int index=0; index < string.length(); index++) {
			if(Character.isDigit(string.charAt(index))) {
				temp+=string.charAt(index);
			}else {
				if(temp.length()>0) {
					sum+=Integer.parseInt(temp);
					temp="";
				}
			}
		}
		if(temp.length()>0)
			sum+=Integer.parseInt(temp);
		System.out.println("Sum of all numbers in given string "+string+" is: "+sum);
	}

	public static void main(String[] args) {
		new SumOfNumbers().sumOfAllNumbers("te123ch9kj8");
	}
}
