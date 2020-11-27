package deepak;

public class CodingExam3Program2 {
	
void findDuplicates(String[] arr) {
		
		for(int index=0; index<arr.length; index++) {
			
			for(int j=index+1; j<arr.length;j++) {
			
			if(arr[index]==arr[j]) {
				
				System.out.println(arr[index]);
			}
		}
		
		}
	}

	public static void main(String[] args) {
		
		String[] arr = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		
		CodingExam3Program2 codingExam3Program2 = new CodingExam3Program2();
		codingExam3Program2.findDuplicates(arr);
	}
}
