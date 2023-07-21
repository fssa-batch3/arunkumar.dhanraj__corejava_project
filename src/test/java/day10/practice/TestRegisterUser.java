package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestRegisterUser {

	@Test
	void testUser1() {
		RegisterUser user1 = new RegisterUser();
		User newuser = new User(1, "Gopi", "gopi@gmail.com");
		 
		

		try {
			user1.register(newuser);
			ArrayList<User> arr = user1.getArr();
			assertEquals("gopi@gmail.com",arr.get(arr.size()-1).getEmailId());
		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}

	}

}
