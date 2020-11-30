package darshana;

class Sortnumber{
	
	public static void main(String args[]){
	    int array[] = new int[]{10, 11, 88, 2, 12, 120};
	    int total=0;
	    
	    //  max value
	    int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    //  min value
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	    
	    int avg = getAvg(array);
	    System.out.println("Average is Value is: "+avg);
	  }
	 
	  // getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	  // average value
	  public static int getAvg(int[] inputArray) {
		  int avgValue= inputArray[0];
		  for(int i=1;i<inputArray.length;i++) {
			  total = total + array[i];
			  avg = total / inputArray;
			  avgValue = inputArray[i]; 
		  }  		
		  }
	  	return avgValue;
}