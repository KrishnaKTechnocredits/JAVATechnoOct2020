package technoCredits.exception;

import java.io.IOException;

public class ClientException {

	public static void main(String[] args) throws IOException {
		Parent p1 = new Child();
		p1.m1();
	}
}
