package Himali_Assignment34;

public class Program1 {

		void verifyStringPalindrom(String str){
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			if(str.equals(rev)) {
				System.out.println(str+ " is palindrom");
			}else {
				System.out.println(str+ " is not palindrom");

			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 program1=new Program1();
		String str="naman";
		program1.verifyStringPalindrom(str);

	}

}
