package day09.practice;

import java.util.Comparator;

public class SortATaskByDate implements Comparator<Task> {
	public int compare(Task a, Task b) {

		int monthComparison = a.getDeadline().getMonth().compareTo(b.getDeadline().getMonth());

		if (monthComparison != 0) {
			return monthComparison;
		} else {
			if (a.getDeadline().getDayOfMonth() > b.getDeadline().getDayOfMonth()) {
				return 1;
			} else {
				return -1;
			}
		}

	}
}