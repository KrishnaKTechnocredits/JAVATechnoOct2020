package suresh;

import java.util.Arrays;

public class SumofTriplet {
	public static void findTriplet(int[] A)
    {
         Arrays.sort(A);
        int n = A.length;
        int ans = 0;

        if (n <= 2) {
            System.out.print("No triplet exists since the list has less than 3 elements");
        }
 
                if (A[n-1] * A[n-2] * A[n-3] > A[0] * A[1] * A[n-1]) {
        	int sum =  A[n-1] +  A[n-2]  + A[n-3];
        	System.out.print("Maximum sum of Triplet is (" + A[n-1] + ", " + A[n-2] + ", " + A[n-3] + ")"+ "-->"+sum);
            
        }
        else {
            System.out.print("Triplet Answer is (" + A[0] + ", " + A[1] + ", " + A[n-1] + ")");
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 10,12,8,20,18,22,15,13,17 };
        findTriplet(A);
    }
}
