package technoCredits.loop;

public class Example6 {
	
	void processData() {
		int count = 0;
		for(int index=0;index<5;index++) {
			count = count + 10;
			if(index % 3 == 0) {
				//break;
			}else {
				break;
			}
			System.out.println(count);
		}
	}
}
