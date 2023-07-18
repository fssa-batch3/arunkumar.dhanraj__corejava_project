package day06.practice;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Task {

	private String taskName;
	private int priority;
	private int id;
	private LocalDate deadline;

	public Task(String name, int id, LocalDate date) {
		this.taskName = name;
		this.id = id;
		this.deadline = date;
	}

	@Override
	public boolean equals(Object o) {

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Task task = (Task) o;
		return Objects.equals(taskName, task.getTaskName()) && Objects.equals(deadline, task.getDeadline());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDeadline() {

		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public Task(String name, int priority) {
		this.setTaskName(name);
		this.setPriority(priority);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
