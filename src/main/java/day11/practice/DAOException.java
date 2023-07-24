package day11.practice;

public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOException(String str) {
		super(str);

	}
	
	public DAOException(Throwable e) {
		super(e);

	}
}
