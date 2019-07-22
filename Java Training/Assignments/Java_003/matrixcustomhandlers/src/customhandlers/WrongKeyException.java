package customhandlers;

//this exception handles any incorrect keys inputted
public class WrongKeyException extends Exception{
	public WrongKeyException(String message) {
		super(message);
	}
}
