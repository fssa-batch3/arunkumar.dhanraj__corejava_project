package day03.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestEmployee {

	@Test
	void test1() {
		Employee e1 = new Employee(1, "ARUN");
		assertEquals(1, e1.getId());
	}
	
	@Test
	void test2() {
		Employee e2 = new Employee(99, "KUMAR");
		assertNotEquals("Bharath", e2.getName());
	}

}
