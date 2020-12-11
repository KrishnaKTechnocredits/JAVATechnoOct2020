package deepak;

public class ArrayIdenticalOrNot {
	static boolean flag;
	void checkIdentical(int[] ar1, int[] ar2) {
		
		boolean flag = false;
	
		if(ar1.length == ar2.length) {
			
			for(int index=0; index < ar1.length; index++) {
				
				if(ar1[index] == ar2[index])
					flag = true;
				else
					flag = false;
			}
		} 
		
		if(flag == true) {
			
			System.out.println("Arrays Are Identical");
		}
		else 
			System.out.println("Arrays Are NOT Identical");
	}
	
	public static void main(String[] args) {
		
		int[] ar1 = {10,12,55,32,18};  
		int[] ar2 = {10,12,55,32,18};
		
		ArrayIdenticalOrNot arrayIdenticalOrNot = new ArrayIdenticalOrNot();
		arrayIdenticalOrNot.checkIdentical(ar1, ar2);
	}

}
