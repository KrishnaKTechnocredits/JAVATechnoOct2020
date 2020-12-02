package darshana;

	import java.util.*;
	 
	public class CFG{
	 
	static int maxLength(String []arr)
	{

	    int len = Integer.MIN_VALUE;

	    int N = arr.length;
	 
	    for(int i = 0; i < N; i++)

	    {

	        int l = arr[i].length();
	 
	        if (len < l) 

	        {

	            len = l;

	        }

	    }
	 
	    return len;
	}
	 
	static void maxStrings(String []arr, int len)
	{

	    int N = arr.length;

	    Vector<String> ans = new Vector<String>();
	 
	    for(int i = 0; i < N; i++)

	    {

	        if (len == arr[i].length())

	        {

	            ans.add(arr[i]);

	        }

	    }
	 
	    for(int i = 0; i < ans.size(); i++)

	    {

	        System.out.print(ans.get(i) + " ");

	    }
	}
	
	static void printStrings(String [] arr)
	{

	    int max = maxLength(arr);
	 
	    maxStrings(arr, max);
	}

	public static void main(String[] args)
	{

	    String []arr = { "Darshana", "zeenat", "ruhi"};
	    printStrings(arr);
	}
}   