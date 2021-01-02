package technoCredits;

 class Example3 {
	int count;
	
	void displayCount() {
		System.out.println(count+"Hi");
		count = count + 1;
	}
	
	public static void main(String[] args) {
		Example3 example3_1 = new Example3();
		example3_1.displayCount(); // 
		example3_1.displayCount(); //
		
		Example3 example3_2 = new Example3();
		example3_2.displayCount(); //
		
		Example3 example3_3 = new Example3();
		example3_3.displayCount(); // 
		
	}
}
