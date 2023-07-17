package day06.practice;

public class Task {
	
	private String taskName;
    
    private int priority;
    
    public Task(String name,int priority) {
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
