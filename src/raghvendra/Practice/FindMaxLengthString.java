package raghvendra.Practice;
//4) find max length string from array. [expected time 12 mins] 

public class FindMaxLengthString {
	void findMaxString(String[] arr) {
		String max=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(max.length()<arr[index].length())
				max=arr[index];
		}
		System.out.println("Max String is:"+max+" Length " +max.length());
	}
	public static void main(String[] args) {
		FindMaxLengthString findMaxLengthString=new FindMaxLengthString();	
		String[] arr= {"Raghv","Nagendra","abakabadafaga","Arerre","abakabadafagarahul"};
		findMaxLengthString.findMaxString(arr);
	}

}
