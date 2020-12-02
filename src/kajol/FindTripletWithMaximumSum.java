/*Assignment - 28 : 25th Nov'2020 

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

package kajol;

public class FindTripletWithMaximumSum {
		void findTriplet(int []inputArray) {
			int sum=0;
			int count=0;
			int max=0;
			int maxIndex=0;
			for(int index=0;index<inputArray.length;index++) {
				sum+=inputArray[index];
				count++;
				if(count==3 && sum>max) {
					max=sum;
					sum=0;
					count=0;
					maxIndex=index;
				}	
			}	
			System.out.println("Triplet with Maximum Sum : "+inputArray[maxIndex-2]+","+inputArray[maxIndex-1]+","+inputArray[maxIndex]);
			System.out.println("Maximum Sum : "+max);	
		}
		
		public static void main(String[] args) {
			int []inputArray= {10,12,8,20,18,22,15,13,17};
			new FindTripletWithMaximumSum().findTriplet(inputArray);
		}
}
