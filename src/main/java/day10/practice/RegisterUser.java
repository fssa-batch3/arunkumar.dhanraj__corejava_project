package day10.practice;

import java.util.ArrayList;

public class RegisterUser {

	public static ArrayList<User> arr = new ArrayList<>();

	public ArrayList<User> getArr() {
		return arr;
	}


	public ArrayList<User> register(User user) throws UserAlreadyExistsException {

		if (user.getEmailId().isEmpty())
			throw new UserAlreadyExistsException("Email Id is empty");

		for (User exist : arr) {
			if (exist.getEmailId().equals(user.getEmailId()))
				throw new UserAlreadyExistsException(user.getEmailId() + " is already exists");
		}

		arr.add(user);

		return arr;

	}

	public static void main(String[] args) {

		RegisterUser registerUser = new RegisterUser();

		User user1 = new User(1, "Arun", "arun@gmail.com");
		User user2 = new User(2, "kumar", "kumar@gmail.com");
		User user3 = new User(3, "Arun", "arun@gmail.com");

		try {
			registerUser.register(user1);
			registerUser.register(user2);
			registerUser.register(user3);

			for (User user : arr) {

				System.out.println("Id:" + user.getId() + " Name:" + user.getName() + " Email Id:" + user.getEmailId());

			}

		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}
	}

}
