package technoCredits.oops.p1;

public class Employee implements Manager{
	static int x = 20;
	
	
	public void m1() {
		System.out.println(x); // 20
		System.out.println(Manager.x); // 10
		System.out.println(Employee.x); // 20
		Employee e1 = new Employee();
		System.out.println(e1.x); // 20
		System.out.println(y);
		Manager mng = new Manager();
	}


	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
