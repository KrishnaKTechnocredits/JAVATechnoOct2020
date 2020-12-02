package prasad.Stringandarray;

public class Findiftwostrareindentical {
	
	boolean scanStr(String input1 , String input2) {
		boolean flag = false;
		int count=0;
		for(int index=0 ; index<input1.length(); index++) {
			if(input1.length()!=input2.length() || input1.charAt(index)!=input2.charAt(index))
				break;
			
			else if(input1.charAt(index)== input2.charAt(index)) {
					count++;
			}
			
			if(count == input1.length())
				flag=true;
		}
		
		return flag;
	}
	
	public static void main(String []arg) {
		Findiftwostrareindentical findiftwostrareindentical = new Findiftwostrareindentical();
		String input1 = "prasad chitale";
		String input2 = "Prasad Chitale";
		boolean output = findiftwostrareindentical.scanStr(input1, input2);
		if(output)
			System.out.println("Two strings are indentical");
		else 
			System.out.println("Two strings are NOT indentical");
			
	}
}
