package anjaliS;

public class NumberArray {
	int min(int[]num) {
	int min = num[0];
	  for (int index = 0; index < num.length; index++)
		if (num[index] < min)
	     min = num[index];
      return min;
    }
       int max(int[] num) {
	   int max = num[0];
		for (int index = 0; index < num.length; index++)
		 if (num[index] > max)
		   max = num[index];
      return max;
	}
       float avg(int[]num){
       int sum = 0;
         for(int index=0;index<num.length;index++)
           sum = sum + num[index];
           System.out.println("Sum of array is " +sum);
       return sum/num.length;
    }
       float displayMinMaxAvg(int[] num) {

	   return (min(num) + max(num)) / 2;

	}

	  void displayReverseNumber(int[] num) {
		System.out.println("Reverse numbers are  ");
		 for (int index = num.length - 1; index >= 0; index--)
		   System.out.println(num[index] + " ");
    }
      void displayFowardNumber(int[] num) {
		System.out.println("Forward numbers are  ");
		  for (int index = 0; index < num.length - 1; index++)
			System.out.println(num[index] + " ");
	}
      public static void main(String[] args){
		int[] res = {60,50,-40,60,-32,10};
		NumberArray numberarray = new NumberArray();
		numberarray.displayReverseNumber(res);
		numberarray.displayFowardNumber(res);
		System.out.println("Average of numbersarray is "+numberarray.avg(res));
		System.out.println("Minimum number in array is "+numberarray.min(res));
		System.out.println("Maximum number in array is "+numberarray.max(res));
    }
}
