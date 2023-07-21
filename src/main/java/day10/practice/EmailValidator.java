package day10.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public boolean isValidEmail(String emailId) throws InvalidEmailException {

		String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);

		if (emailId.isEmpty())
			throw new InvalidEmailException("Email Id is empty");
		else if (!matcher.matches())
			throw new InvalidEmailException("Invalid Email Id");

		return true;

	}

	public static void main(String[] args) {

		try {
			System.out.println(new EmailValidator().isValidEmail("arungmail.com"));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}

	}

}
