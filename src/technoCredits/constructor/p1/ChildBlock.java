package technoCredits.constructor.p1;

public class ChildBlock extends ParentBlock {
	
	{
		System.out.println("Child non-static block");
	}
	
	public ChildBlock() {
		super();
		System.out.println("Child No param Constructor");
	}
	
	static{
		System.out.println("Child Static");
	}
	
	public static void main(String[] args) {
		
	}
	
}
