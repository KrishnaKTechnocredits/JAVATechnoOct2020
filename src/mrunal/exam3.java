package mrunal;
/* to find duplicate elements from two given arrays  */

public class exam3 {
	
	void duplicateFromIntArray(int[] arr)
	{
		
		for(int i = 0; i < arr.length; i ++) 
		{
			int count = 0;
			for(int j = 0; j < arr.length; j++) 
			{
				if(arr[i] == arr[j]) 
				{
					count ++;
				}
			}
			if(count > 1) 
			{
				System.out.println( arr[i]);
			}
		}
	}

	void duplicateFromStringArray(String[] arr)
	{
		for(int i = 0; i<arr.length; i++) 
		{
			int count = 0;
			for(int j = 0; j<arr.length; j++) 
			{
				if(arr[i].equals(arr[j])) 
				{
					count ++;
				}
			}
			if(count > 1) 
			{
				System.out.println( arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		exam3 e = new exam3();
		
		int[] arr = {10,12,55,32,17,12,32};
		String[] str = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		
		System.out.println("printing duplicate  integer array : ");
		e.duplicateFromIntArray(arr);
		
		System.out.println("printing duplicate String array : ");
		e.duplicateFromStringArray(str);
		
	}

}