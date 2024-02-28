package com.learning.jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"260101");
			System.out.println("Connected: " + connection);

			Statement s = connection.createStatement();

			s.addBatch("INSERT INTO STUDENT VALUES(4, 'KATY', 'HE', 91)");
			s.addBatch("INSERT INTO STUDENT VALUES(5, 'NAT', 'ROF', 56)");
			s.addBatch("INSERT INTO STUDENT VALUES(6, 'BRUCE', 'BAN', 63)");
			s.addBatch("INSERT INTO STUDENT VALUES(7, 'STEVE', 'ROG', 78)");

			int[] res = s.executeBatch();
			for (int i : res)
				System.out.println(i);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
