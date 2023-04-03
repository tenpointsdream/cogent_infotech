package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem7JDBC {
	public static void main(String[] args) {
		String query = "select emp_name, emp_dept from dept where emp_dept=1";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				PreparedStatement pstmt = conn.prepareStatement(query);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee name: " + rs.getString(1));
				System.out.println("Employee Dept: " + rs.getInt(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
