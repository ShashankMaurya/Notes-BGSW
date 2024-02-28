package com.learning.jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class InsertJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"260101");
			System.out.println("Connected: " + connection);

//			Statement statement = connection.createStatement();
//			int n = statement.executeUpdate("INSERT INTO STUDENT VALUES(2, 'BEE', 'RAY', 90)");
			PreparedStatement ps = connection.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?)");
			ps.setInt(1, 2);
			ps.setString(2, "Dia");
			ps.setString(3, "Dy");
			ps.setInt(4, 77);
			System.out.println(ps.executeUpdate());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
