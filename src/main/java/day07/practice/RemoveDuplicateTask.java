package day07.practice;

import day06.practice.*;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RemoveDuplicateTask {



	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str = "18-07-2023";

		LocalDate date1 = LocalDate.parse(str, dtf);
		

		ArrayList<Task> arr = new ArrayList<>();

		Task task1 = new Task("Brush", 1, date1);
		Task task2 = new Task("Brush", 2, date1);
		Task task3 = new Task("Sleep", 3, date1);
		Task task4 = new Task("Sleep", 4, date1);
		

		arr.add(task1);
		arr.add(task2);
		arr.add(task3);
		arr.add(task4);

		HashSet<Task> taskSet = new HashSet<>();

		for (int i = 0; i < arr.size(); i++) {

			boolean check = true;
			for (int j = i + 1; j < arr.size(); j++)
				if (arr.get(i).equals(arr.get(j))) {
					check = false;

				}
			if (check) {
				taskSet.add(arr.get(i));

			}

		}

		for (Task t : taskSet) {
			System.out.println("Task Id: "+t.getId() );
			System.out.println("Task Name: " + t.getTaskName());
			System.out.println("Task Priority: " + t.getDeadline());
			System.out.println();

		}

	}

}
