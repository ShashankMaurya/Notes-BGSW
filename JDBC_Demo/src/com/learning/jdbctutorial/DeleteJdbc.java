package com.learning.jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"260101");
			System.out.println("Connected: " + connection);

			Statement statement = connection.createStatement();
			int n = statement.executeUpdate("DELETE FROM STUDENT WHERE STUID=2");
			System.out.println(n);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
