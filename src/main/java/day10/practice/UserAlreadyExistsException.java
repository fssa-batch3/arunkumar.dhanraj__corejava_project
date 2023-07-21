package day10.practice;

public class UserAlreadyExistsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(String str) {
		super(str);
	}
	
	public UserAlreadyExistsException(Throwable t) {
		super(t);
	}

}
