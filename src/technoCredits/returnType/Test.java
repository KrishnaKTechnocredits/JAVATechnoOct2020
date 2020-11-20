package technoCredits.returnType;

class Test{
	void processData(double data){
		if(data < 60)
			System.out.println("Has to work hard");
		else if(data < 50)
			System.out.println("You really need to revise everythinh again");
		else if(data < 40)
			System.out.println("We can't survive as TAE");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.processData(100);
	}
}