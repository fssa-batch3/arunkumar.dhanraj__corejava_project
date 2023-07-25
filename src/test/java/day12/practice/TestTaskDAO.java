package day12.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import day06.practice.*;
import day11.practice.DAOException;

public class TestTaskDAO {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/corejava";
	private static final String DB_USER = "root"; // Hint: Replace this value with your username
	private static final String DB_PASSWORD = "123456"; // Hint: Replace this value with your password

	private TaskDAO taskDAO = new TaskDAO();

	@BeforeAll
	public static void setupDatabase() throws SQLException {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement stmt = connection.createStatement()) {
			// Create the "tasks" table if it doesn't exist
			String createTableQuery = "CREATE TABLE IF NOT EXISTS tasks (" + "id INT PRIMARY KEY, "
					+ "name VARCHAR(255), " + "status VARCHAR(50))";
			stmt.executeUpdate(createTableQuery);
		}
	}

	@AfterAll
	public static void tearDownDatabase() throws SQLException {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement stmt = connection.createStatement()) {
			// Drop the "tasks" table after all tests are executed
			String dropTableQuery = "DROP TABLE IF EXISTS tasks";
			stmt.executeUpdate(dropTableQuery);
		}
	}

	@Test
	public void testCreateTask() throws DAOException {
		Task task = new Task(65, "Test Task", "PENDING");

		taskDAO.createTask(task);

		// Retrieve the task from the database and validate its properties
		Task retrievedTask = getTaskById(task.getId());
		assertNotNull(retrievedTask);
		assertEquals(task.getTaskName(), retrievedTask.getTaskName());
		assertEquals(task.getStatus(), retrievedTask.getStatus());
	}

	@Test
	public void testUpdateTask() throws DAOException {
		// Prepare a task to be updated in the database
		Task task = new Task(76, "Task to be Up", "PENDING");
		taskDAO.createTask(task);

		// Update the task's properties
		task.setTaskName("Updat");
		task.setStatus("COMPLETED");
		taskDAO.updateTask(task);

		// Retrieve the updated task from the database and validate its properties
		Task retrievedTask = getTaskById(task.getId());
		// Hint: Check if retrievedTask is not null
		assertNotNull(retrievedTask);
		// Hint: Check if retrievedTask name is the same as the created task name
		assertEquals(task.getTaskName(), retrievedTask.getTaskName());
		// Hint: Check if retrievedTask status is the same as the created task status
		assertEquals(task.getStatus(), retrievedTask.getStatus());

	}

	@Test
	public void testDeleteTask() throws DAOException {
		// Prepare a task to be deleted in the database
		Task task = new Task(93, "Task to be Delet", "PENDING");
		taskDAO.createTask(task);
		// add code here
		taskDAO.deleteTask(task.getId());
		// Hint: Delete the task from the database
		// add code here

		// Attempt to retrieve the deleted task from the database and validate it's null
		Task retrievedTask = getTaskById(task.getId());
		assertNull(retrievedTask);
	}

	@Test
	public void testGetAllTasks() throws DAOException {
		// Hint: Prepare sample tasks to be retrieved from the database

		// Hint: Insert the sample tasks into the database

		// Retrieve all tasks from the database
		List<Task> tasks = taskDAO.getAllTasks();

		// Hint: Test the list size
		assertNotNull(tasks);
		// Hint: Test the contents of the list

	}

	// Helper method to retrieve a task by its ID from the database
	private static Task getTaskById(int taskId) throws DAOException {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String query = "SELECT id, name, status FROM task WHERE id=?;";
			try (PreparedStatement stmt = connection.prepareStatement(query)) {
				stmt.setInt(1, taskId);
				try (ResultSet rs = stmt.executeQuery()) {
					if (rs.next()) {
						Task task = new Task();
						task.setId(rs.getInt("id"));
						task.setTaskName(rs.getString("name"));
						task.setStatus(rs.getString("status"));
						return task;
					}
				}
			}
		} catch (SQLException e) {
			throw new DAOException("Error while retrieving task by ID", e);
		}
		return null;
	};

	public static void main(String[] args) throws DAOException {
		Task t = getTaskById(1);
		System.out.println(t.getTaskName());

	}
}
