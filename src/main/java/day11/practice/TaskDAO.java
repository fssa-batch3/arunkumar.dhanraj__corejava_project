package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDAO {

	public void createTask(CreateTask task) throws DAOException, SQLException {

		// Write code here to get connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Task", "root", "123456");
		System.out.println(connection);

		// Create insert statement
		String query = "INSERT INTO tasklist (id, name, status) VALUES (?, ?, ?)";
		PreparedStatement stmt = connection.prepareStatement(query);

		// Set parameter values for PreparedStatement
		stmt.setInt(1, task.getId());
		stmt.setString(2, task.getName());
		stmt.setString(3, task.getStatus());

		// Execute insert statement
		int rows = stmt.executeUpdate();
		System.out.println("Rows Added: "+rows);

		// close connection
		stmt.close();
		connection.close();
	}

}
