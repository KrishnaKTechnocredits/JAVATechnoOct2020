package sadhana;

/*Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, 
you need to write a Java program to find that missing number in an array.*/

class MissingNumber_InArray30 {
   
    static int printData(int arr[], int num)
    {
        int i, total;
        total = (num + 1) * (num + 2) / 2;
        for (i = 0; i < num; i++)
            total -= arr[i];
        return total;
    }

    public static void main(String args[])
    {
        int a[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int missingNumber = printData(a, 9);
        System.out.println(missingNumber);
    }
}
