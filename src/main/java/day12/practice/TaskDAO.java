package day12.practice;

import java.sql.*;
import java.util.*;

import day06.practice.Task;
import day11.practice.DAOException;

public class TaskDAO {

	public void createTask(Task task) throws DAOException {
	    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava", "root", "123456");
	         PreparedStatement stmt = connection.prepareStatement("INSERT INTO task (id, name, status) VALUES (?, ?, ?)")) {
	        // This is the
	        // try-with-resources

	        // Hint: Set the values for the PreparedStatement using task properties

	        stmt.setInt(1, task.getId());
	        stmt.setString(2, task.getTaskName());
	        stmt.setString(3, task.getStatus());

	        int rows = stmt.executeUpdate();

	        System.out.println("Rows Affected: " + rows);
	      

	        // Hint: Execute the update statement
	    } catch (SQLException e) {
	        throw new DAOException("Error in createTask method", e);
	    }
	}

	public void updateTask(Task task) throws DAOException {
	    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava", "root", "123456")) {

	        // Hint: Add the SQL update statement here
	        PreparedStatement stmt = connection.prepareStatement("UPDATE task SET name = ?, status = ? WHERE id = ?");

	        // Hint: Set the values for the PreparedStatement using task properties
	        stmt.setString(1, task.getTaskName());
	        stmt.setString(2, task.getStatus());
	        stmt.setInt(3, task.getId());

	        // Hint: Execute the update statement
	        stmt.executeUpdate(); // This line is missing in the original code

	      
	    } catch (SQLException e) {
	        throw new DAOException("Error in updateTask method", e);
	    }
	}


	public void deleteTask(int taskId) throws DAOException {
	    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava", "root", "123456");
	         PreparedStatement stmt = connection.prepareStatement("DELETE FROM task WHERE id=?;")) {
	        // Set the value for the PreparedStatement using the taskId
	        stmt.setInt(1, taskId);

	        // Execute the delete statement
	        stmt.executeUpdate();

	    } catch (SQLException e) {
	        // Catch the SQLException and throw DAOException with appropriate message
	        throw new DAOException("Error in deleteTask method", e);
	    }
	}


	public List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava", "root",
				"123456");
				PreparedStatement stmt = connection.prepareStatement("SELECT id, name, status FROM task;");
				ResultSet rs = stmt.executeQuery()) {

			// Hint: Iterate over the ResultSet to create Task objects and add them to the
			// tasks list

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String sts = rs.getString("status");

				tasks.add(new Task(id, name, sts));
			}

			
		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}
		
		

		return tasks;
	}
}