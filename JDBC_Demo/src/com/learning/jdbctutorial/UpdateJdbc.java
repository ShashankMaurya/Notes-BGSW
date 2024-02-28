package com.learning.jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"260101");
			System.out.println("Connected: " + connection);

			Statement statement = connection.createStatement();
			int n = statement.executeUpdate("UPDATE STUDENT SET SCORE = 80 WHERE STUID=1");
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
