package day06.practice;

import java.util.ArrayList;

public class FindTaskByName {

	private String taskName;
	private ArrayList<Task> tasks;

	public FindTaskByName(String name, ArrayList<Task> tasks) {
		this.taskName = name;
		this.tasks = tasks;
	}
	

	public boolean findTask() {

		for(Task task:tasks) {
			if(task.getTaskName().equals(taskName)) {
				return true;
			}
		}
		return false;

	}
	
	public static void main(String[] args) {
		
		TaskDetails details = new TaskDetails();
		 details.addTask("Brushing", 1);
		 details.addTask("Cooking", 2);
		 details.addTask("Sleeping", 4);
		 details.addTask("Dancing", 0);
		 
		 String found ="Sleeping"; 
		 
		 FindTaskByName find = new FindTaskByName(found,details.getTasks());
		 
		System.out.println(find.findTask()); 
		 
		 
		 
		
	}
}
