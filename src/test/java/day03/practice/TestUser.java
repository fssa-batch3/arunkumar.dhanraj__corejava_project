package day03.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUser {
	
	@Test
	void test1() {
		User user1 = new User("Arunkumar","arun@gmail.com","arun123");
		assertEquals("Arunkumar",user1.getName());
		assertNotEquals("password",user1.getPassword());
	}
	
	@Test
	void test2() {
		User user2 = new User();
		user2.setName("Kumar");
		user2.setEmail("kumar@gmail.com");
		assertNotEquals("mailid",user2.getEmail());
		assertEquals("Kumar",user2.getName());
		
	}
	
}
