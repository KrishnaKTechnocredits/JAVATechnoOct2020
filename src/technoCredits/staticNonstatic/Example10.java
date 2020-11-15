package technoCredits.staticNonstatic;

public class Example10 {
	int cnt = 10;
	boolean flag = true;

	void m1() {
		while (flag) {
			cnt++;
			System.out.println("Hi");
			cnt++;
			if((cnt == 1) && true)
				break;
		}
		System.out.println(cnt);
	}
}
