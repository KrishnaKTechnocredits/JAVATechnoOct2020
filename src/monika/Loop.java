package monika;
class Loop {
	void divisible1(int start,int end) {
		System.out.println("-------------Even Numbers----------------");
		int index=start;
		while(index<=end) {
			if(index%2==0)
				System.out.println(index);
		index++;
		}
	}
	void divisibleby5(int start,int end) {
		System.out.println("-------------Numbers divisible by 5----------------");
		int index=start;
		while(index<=end) {
			if(index%5==0)
				System.out.println(index);
			index++;
		}
	}
	void divisibleby3(int start,int end) {
		System.out.println("-------------Numbers divisible by 3 and 5----------------");
		int index=start;
		while(index<=end) {
			if(index%5==0 && index%3==0)
				System.out.println(index);
		index++;		
		}
	}
	void divisibleby7(int start,int end) {
		System.out.println("-------------Numbers divisible by 7 or 13---------------");
		int index=start;
		while(index<=end) {
			if(index%7==0||index%13==0)
				System.out.println(index);
			index++;
		}
	}
	

		public static void main(String[] args){
			Loop loop = new Loop();
			loop.divisible1(10, 15);
			loop.divisibleby5(10, 30);
			loop.divisibleby3(5, 18);
			loop.divisibleby7(5, 40);
			
			

		}
}