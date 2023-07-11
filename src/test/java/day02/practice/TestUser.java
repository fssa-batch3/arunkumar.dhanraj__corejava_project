package day02.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class TestUser {
	
	@Test
	 void testGetterSetters() {
		// create Account
		User user = new User();
	   user.setName("Arun");
	   user.setId(1);
	   user.setEmail("arun@gmail.com");
	   user.setPassword("2022");

		assertEquals("Arun",user.getName());
		assertEquals(1,user.getId());
		assertEquals("arun@gmail.com",user.getEmail());
		assertEquals("2022",user.getPassword());
	}

}
