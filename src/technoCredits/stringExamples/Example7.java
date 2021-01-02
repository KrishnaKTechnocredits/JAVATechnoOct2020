package technoCredits.stringExamples;

public class Example7 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hi");
		sb.append("Hello");
		sb.append("Hi");
		System.out.println(sb);
		
		StringBuffer name = new StringBuffer("Maulik");
		for(int index=1;index<=10;index++) {
			name.append(index);
			System.out.println(name);
		}
	}
}
