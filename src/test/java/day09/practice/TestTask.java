package day09.practice;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestTask {

	@Test
	void task1() {
		LocalDate date1 = LocalDate.parse("2023-07-20");
		LocalDate date2 = LocalDate.parse("2023-07-21");
		LocalDate date3 = LocalDate.parse("2023-07-22");

		TreeSet<LocalDate> set = new TreeSet<>();
		set.add(date2);
		set.add(date1);
		set.add(date3);

		Task task1 = new Task(5, "Brush", date1);
		Task task2 = new Task(5, "Brush", date2);
		Task task3 = new Task(5, "Brush", date3);

		ArrayList<Task> list = new ArrayList<>();
		list.add(task3);
		list.add(task2);
		list.add(task1);

		Collections.sort(list, new SortATaskByDate());

		assertEquals(set.iterator().next(), list.get(0).getDeadline());
	}
	
	@Test
	void task2() {
		LocalDate date1 = LocalDate.parse("2023-07-20");
		LocalDate date2 = LocalDate.parse("2023-07-21");
		LocalDate date3 = LocalDate.parse("2023-07-22");
		

		Task task1 = new Task(5, "Brush", date1);
		Task task2 = new Task(5, "Brush", date2);
		Task task3 = new Task(5, "Brush", date3);

		ArrayList<Task> list = new ArrayList<>();
		list.add(task3);
		list.add(task2);
		list.add(task1);

		Collections.sort(list, new SortATaskByDate());

		assertNotEquals(date2, list.get(0).getDeadline());
	}

}
