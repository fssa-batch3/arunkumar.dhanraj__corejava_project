package day03.practice;

public class User {
	
//	Attributes
	private String name;
	private String email;
	private String password;
	
//	Default constructor
	public User() {
		
	}
	
//	Main constructor
	public User(String name,String email,String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
//	Getter 
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	
//	Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public static void main(String[] args) {
		
		User user1 = new User("Arunkumar","arun@gmail.com","arun123");
		System.out.println("Name: "+user1.name);
		System.out.println("Email: "+user1.email);
		System.out.println("Password: "+user1.password);
		
		System.out.println();
		
		User user2 = new User();
		user2.setName("Sabana");
		user2.setEmail("sabana@gmail.com");
		user2.setPassword("sabana@2022");
		
		System.out.println("Name: "+user2.getName());
		System.out.println("Email: "+user2.getEmail());
		System.out.println("Password: "+user2.getPassword());
		
		

	}

}
