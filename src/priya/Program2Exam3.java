//String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
//output : Techno
//         Hi
package priya;

public class Program2Exam3 {
	void duplicateStringArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			for (int i= index+1;i<arr.length;i++) {
				if(arr[index]==arr[i])
					System.out.println("Duplicate words are: " +arr[i]);
				}
			}	
	}
	public static void main(String[] args) {
		Program2Exam3 program2exam3 = new Program2Exam3();
		String[] array = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		program2exam3.duplicateStringArray(array);
	}
}

