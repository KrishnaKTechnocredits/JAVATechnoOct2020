package technoCredits.constructor.p1;

public class ParentBlock {
	
	static{
		System.out.println("Parent Static");
	}
	
	{
		System.out.println("Parent non-static block");
	}
	
	public ParentBlock() {
		super();
		ParentBlock pb = new ParentBlock();
		System.out.println("Parent No param Constructor");
	}
}
