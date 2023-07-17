package day06.practice;

import java.util.*;

public class TaskDetails {

	private ArrayList<Task> tasks = new ArrayList<>();
	
	public ArrayList<Task> getTasks(){
		return this.tasks;
	}

	public void addTask(String name, int priority) {
		Task task = new Task(name, priority);
		tasks.add(task);
	}

	public void printTasks() {
		for (Task task : tasks) {
			System.out.println("For Task " + task.getTaskName() + " has priority number " + task.getPriority());

		}

	}

	public static void main(String[] args) {

		TaskDetails task = new TaskDetails();

		task.addTask("Brush", 1);
		task.addTask("Bath", 1);
		task.addTask("Going Academy", 0);
		task.addTask("Sleeping", 4);
		
		task.printTasks();

	}

}
