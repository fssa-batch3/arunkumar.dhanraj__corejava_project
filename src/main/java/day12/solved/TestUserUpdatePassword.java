package day12.solved;

import java.sql.*;

public class TestUserUpdatePassword {

	public static void main(String[] args) throws Exception {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava","root","123456");

		// Input
		String name = "Drink";
		int id = 1;

		// DEPOSIT
		String query = "UPDATE task SET name=? WHERE id=?";

		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, name);
		pst.setInt(2, id);

		int rows = pst.executeUpdate();
		System.out.println("No of rows updated " + rows);
	}

}
