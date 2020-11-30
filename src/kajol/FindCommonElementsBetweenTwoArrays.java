/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/


package kajol;

public class FindCommonElementsBetweenTwoArrays {
	 int cmnelements=0;
	void findCommonElements(int array1[],int array2[]) {
		for(int index1=0;index1<array1.length;index1++) {
			for(int index2=0;index2<array2.length;index2++) {
				if(array1[index1]==array2[index2]) {
					cmnelements++;
					if(cmnelements==1)
						System.out.print("Common Elements are : ");
					System.out.print(array1[index1]+" ");
						
				}
			}	
		}	
		if(cmnelements==0) {
			System.out.println("No Common Elements found");
		}
	}
	
	public static void main(String[] args) {
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		new FindCommonElementsBetweenTwoArrays().findCommonElements(array1, array2);
	}
}
