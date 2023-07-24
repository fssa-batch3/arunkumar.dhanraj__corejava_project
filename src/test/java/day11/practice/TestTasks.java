package day11.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.*;

import org.junit.jupiter.api.Test;

class TestTasks {

	@Test
	void testTask1() {
		CreateTask task1 = new CreateTask(3, "Study", "Pending");

		try {
			new TaskDAO().createTask(task1);
		} catch (DAOException | SQLException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "123456");

			String query = "Select * from tasklist";

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				if (task1.getId() == resultSet.getInt("id")) {
					assertEquals(task1.getId(), resultSet.getInt("id"));
				}
			}

			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
