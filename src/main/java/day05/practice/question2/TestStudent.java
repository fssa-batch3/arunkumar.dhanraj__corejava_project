package day05.practice.question2;

public class TestStudent {

	public static void main(String[] args) {
		Department dept1 = new Department("ECE",565);
		Student student1 = new Student("Arunkumar",2,dept1);
		
		System.out.println("Student name: "+student1.name);
		System.out.println("Student Id: "+student1.id);
		System.out.println("Department name: "+student1.department.deptName);
		System.out.println("Department Id: "+student1.department.deptId);
	}

}
