package vaibhav;

public class ArrayIdentical {
	
	public void arrayCompare(int []a1,int []a2) {
		boolean flag = false;
		if (a1.length != a2.length) {
			System.out.println("Array not identical");
			return;
		}
		for(int i = 0; i < a1.length ;i++){
			if(a1[i] == a2[i])
					flag = true;
			else {
					flag = false;
					break;
			}
		}		
		if (flag == false)
			System.out.println("Provided Array is not identical");
		else if (flag == true)
			System.out.println("Provided Array is identical");
}
	public static void main(String[] args) {
		int [] a1 = {10,11,12,32,12,45};
		int [] a2 = {10,9,12,32,12,45};
		ArrayIdentical arrayIdentical = new ArrayIdentical();
		arrayIdentical.arrayCompare(a1,a2);
	}

}
