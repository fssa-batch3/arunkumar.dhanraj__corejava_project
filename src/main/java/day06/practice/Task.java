package day06.practice;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Task implements  Comparable<Task>{

	private String taskName;
	private int priority;
	private int id;
	private LocalDate deadline;
	private String status;


	public Task(String name, int id, LocalDate date) {
		this.taskName = name;
		this.id = id;
		this.deadline = date;
	}
	
	

	public Task(String taskName, LocalDate deadline, int priority) {
		this.taskName = taskName;
		this.deadline = deadline;
		this.priority = priority;
	}
	
	public Task(int id, String name, String status) {
		this.id = id;
		this.taskName = name;
		this.status = status;
	}
	
	public Task() {
	}
	
	
	

	@Override
	public boolean equals(Object o) {

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Task task = (Task) o;

		return Objects.equals(taskName, task.getTaskName()) && Objects.equals(deadline, task.getDeadline());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.taskName, this.deadline);
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
	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
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
	
	public String toString() {
		return "Task [taskName=" + taskName + ", deadline=" + deadline + ", priority=" + priority + "]";
	}
	

	public int compareTo(Task other) {
		// compareTo code here
		return 0;
	}

}

/*
Task task1 = new Task(5,"Reading","Pending");
Task task2 = new Task(6,"Listening","Completed");
Task task3 = new Task(7,"Singing","Pending");
Task task4 = new Task(8,"Talking","Pending");

*/
