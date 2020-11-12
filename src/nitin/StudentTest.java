package nitin;
class StudentTest
{
	int rno=1;
	String name="Nitin";
	
	void display()
	{
		System.out.println(rno);
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		StudentTest s1=new StudentTest();
		s1.display();
	}

}