package day02.practice;

public class User {
	
	private int id;
	private String name;
	private String password;
	private String email;
	
	
//	Getters
	int getId() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	String getPassword() {
		return password;
	}
	
	String getEmail() {
		return email;
	}
	
//	Setters
	void setId(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setPassword(String password) {
		this.password = password;
	}
	
	void setEmail(String email){
		this.email = email;
	}
	
	public static void main(String[] args) {
		User user = new User();
		
//		Setting the user details
		user.setId(1);
		user.setName("Arunkumar");
		user.setEmail("arun19ict@gmail.com");
		user.setPassword("Arun@2022");
		
//		Printing the user's details
		System.out.println("Id: "+user.getId());
		System.out.println("Name: "+user.getName());
		System.out.println("Email: "+user.getEmail());
		System.out.println("Password: "+user.getPassword());
		
	}

}
