package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem4JDBC {

	public static void main(String[] args) {
		String query = "select * from dept where emp_dept in (3,30)";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				PreparedStatement pstmt = conn.prepareStatement(query);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee id: " + rs.getInt(1));
				System.out.println("Employee name: " + rs.getString(2));
				System.out.println("Employee age: " + rs.getInt(3));
				System.out.println("Employee salary: " + rs.getInt(4));
				System.out.println("Employee department: " + rs.getInt(5));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
