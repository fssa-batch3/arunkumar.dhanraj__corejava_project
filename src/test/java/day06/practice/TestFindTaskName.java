package day06.practice;

public class TestFindTaskName {
	
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
