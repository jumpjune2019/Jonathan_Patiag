package customhandlers;

//this custom exception handles any invalid values
public class InvalidValueException extends Exception {
	
	public InvalidValueException(String message) {
		super(message);
	}
}
