
//write a single program having different methods.
 
//a) To find Min number from given array
//b) To find Max number from given array
//c) To find Avg of all numbers from give array
//d) To display all numbers [0 to length]
//e) To display all numbers [length to 0]
//g) Method to find average of min and max number from array.

package monika;
public class Array {

	  int getMaxNumber(int num[]) {

		int max = num[0];
		for(int index=0; index < num.length; index++) {

			if(max < num[index])
				max = num[index];
		}

		return max;
	 }

	  int getMinNumber(int num1[]) {

			int min =num1[0];
			for(int index=0; index < num1.length; index++) {

				if(min > num1[index])
					min = num1[index];

			}
			return min;
		}

	  double getAvgNumbers(int num2[]) {

		   double avg = 0;
		   for(int index=0; index < num2.length; index++) {

			   avg = avg + num2[index]/5;

		   }
				return avg;
		}

	  void getLengthofArray(int num3[]) {

		   for(int index=0; index < num3.length; index++) {

				System.out.println(num3[index]);

		   }	

		}

       void getNumbersInReverse(int num4[]) {

		   for(int index= num4.length-1; index >= 0; index--) {

					System.out.println(num4[index]);
				}

			}

        double getMinMaxAvg(int maxNum, int minNum) {

            double avgOfMinMax = (maxNum + minNum)/2;

            return avgOfMinMax;

        }

		public static void main(String [] args) {

			Array array= new Array();
			int arr[] = {11,20,-4,0,50};
			int maxNumber = array.getMaxNumber(arr);
			System.out.println("Maximum Number : " + maxNumber);
			int minNumber = array.getMinNumber(arr);
			System.out.println("Minimum Number  : " + minNumber);
			double avgOfNumbers = array.getAvgNumbers(arr);
			System.out.println("Average of Numbers : " + avgOfNumbers);
			
			array.getLengthofArray(arr);
			
			array.getNumbersInReverse(arr);
			double avgOfMinMaxNumbers = array.getMinMaxAvg(maxNumber, minNumber);
			System.out.println("Average of Min and Max Numbers is : " + avgOfMinMaxNumbers);

		}

	}

