package technoCredits.exception;

public class AgeNotValidException extends Exception{

	public AgeNotValidException() {
		super("Age should be >= 18");
	}
	
	public AgeNotValidException(String message) {
		super(message);
	}
}
