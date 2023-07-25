package day11.practice;

import java.sql.SQLException;

public class CreateTask {

	private int id;
	private String name;
	private String status;

	public CreateTask(int id, String name, String status) {
		this.id = id;
		this.name = name;
		this.status = status;

	}

	public CreateTask() {
//		default
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void main(String[] args)  {

		CreateTask tasks = new CreateTask(1, "Brush", "Done");

		try {
			new TaskDAO().createTask(tasks);
		} catch (DAOException | SQLException e) {
			e.printStackTrace();
		}

	}

}
