package day03.practice;

public class Employee {
	
	 private int id;
	    private String name;
	 
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    
	    public int getId() {
	    	return id;
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    
	    public static void main(String[] args) {
	        Employee e1 = new Employee(1, "naresh");
	        Employee e2 = new Employee(2, "suresh");
	        
	        System.out.print("id="+e1.id+", ");
	        System.out.println("name="+e1.name);
	        System.out.println();
	        System.out.print("id="+e2.id+", ");
	        System.out.println("name="+e2.name);
	    }

}
