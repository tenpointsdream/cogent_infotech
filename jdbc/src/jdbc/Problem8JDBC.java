package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem8JDBC {
	public static void main(String[] args) {
		String query = "select emp_id, emp_name from dept where emp_salary > (select avg(emp_salary) from dept)";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				PreparedStatement pstmt = conn.prepareStatement(query);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee ID: " + rs.getInt(1));
				System.out.println("Employee name: " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
