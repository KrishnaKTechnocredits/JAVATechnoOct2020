package Himali_CoadingExam4;

public class Exam1 {
	void commonElement() {
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		System.out.println("Common elements :");
		for(int i=0;i<array1.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				
				if(array1[i]==array2[j]) {
					
					System.out.println(array1[i]);
					
					}
				
			}
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Exam1 exam4=new Exam1();
		
		exam4.commonElement();
		
		

		

	}

}
