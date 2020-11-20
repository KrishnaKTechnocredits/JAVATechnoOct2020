package technoCredits.loop;

public class Example1 {
	
	void display(String word,int start, int end) {
		for(int index=start;index<=end;index++) {
			System.out.println(word+"->"+index);
		}
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.display("Techno",1,3);
		example1.display("Credits",10,15);
	}
}
