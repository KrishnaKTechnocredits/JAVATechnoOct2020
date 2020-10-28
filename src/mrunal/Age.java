package mrunal;

public class Age {
	String name;
	int age;
	
	void ageAndNameIs(String name , int age )
	{
		System.out.println(name + "'s age is " + age);
	}
public static void main (String [] args)
{
	Age a = new Age();
	a.ageAndNameIs("vihan" , 3);
	a.ageAndNameIs("rudra" , 13);
	a.ageAndNameIs("drushti" ,5);

}
}
