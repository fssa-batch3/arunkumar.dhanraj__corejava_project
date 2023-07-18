package day07.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import day06.practice.*;

class TestTask {
	
	@Test
	void testTask1() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str = "18-07-2023";

		LocalDate date1 = LocalDate.parse(str, dtf);
		Task task1 = new Task("Sleep",1,date1);
		Task task2 = new Task("Sleep",2,date1);
		
		
		
		assertEquals(task1,task2);
	}
	
	@Test
	void testTask2() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str = "18-07-2023";

		LocalDate date1 = LocalDate.parse(str, dtf);
		Task task1 = new Task("Sleep",1,date1);
		Task task2 = new Task("Study",1,date1);
		
		
		assertNotEquals(task1,task2);
	}

}
