package day02.practice;

public class Logger {
	
	public String debug (String msg) {
		System.out.println("DEBUG Message: " + msg);
		return msg;
	}
	
	public int debug (int num) {
		System.out.println("DEBUG Number: "+num);
		return num;
	}
	
	public String info (String msg) {
		System.out.println("INFO Message: "+msg);
		return msg;
	}
	
	public int info (int num) {
		System.out.println("INFO Number: "+num);
		return num;
	
	}
	
	public String error (String msg) {
		System.out.println("ERROR Message: "+msg);
		return msg;
	}
	
	public int error (int num) {
		System.out.println("ERROR Number: "+num);
		return num;
	}
	
	public static void main(String[] args) {
		
		Logger log = new Logger();
		
		log.debug("Change something at line");
		log.debug(1);
		
		log.info("Your code ready to go");
		log.info(0);
		
		log.error("Another error occurs at line");
		log.error(5);
	}
	

}
