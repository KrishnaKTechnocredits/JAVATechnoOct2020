package kajol;

public class StringArrayExam1 {
	
	String getMaximumLengthName(String[] arr) {
		int maxlength=0;
		String maxname =arr[0];
		for(int i=0; i<arr.length;i++) {
			if (arr[i].length()>maxlength) {
				maxlength=arr[i].length();
				maxname=arr[i];
			}
		}
		System.out.println("Maximum Lenght name is :"+maxname+" and its lenght is :"+maxlength);
		return maxname;
	}
	
	void displayEvenCharacters(String name) {
		for(int i=1; i<name.length();i++) {
			if(i%2!=0)
			System.out.println(name.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		StringArrayExam1 exam1= new StringArrayExam1();
		String arr[]= {"Harsh","Maulik","Technocredits","Krsishna"};
		String name=exam1.getMaximumLengthName(arr);
		exam1.displayEvenCharacters(name);
		
	}

}	
