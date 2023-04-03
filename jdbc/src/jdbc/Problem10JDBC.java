package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem10JDBC {
	public static void main(String[] args) {
		String query = "select * from dept where emp_salary='10000'";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				PreparedStatement pstmt = conn.prepareStatement(query);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee ID: " + rs.getInt(1));
				System.out.println("Employee name: " + rs.getString(2));
				System.out.println("Employee age: " + rs.getInt(3));
				System.out.println("Employee salary: " + rs.getInt(4));
				System.out.println("Employee Department: " + rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
