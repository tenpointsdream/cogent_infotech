package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem6JDBC {
	public static void main(String[] args) {
		String query = "select emp_name from dept where emp_salary = (select max(emp_salary) from dept where emp_dept=2)";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				PreparedStatement pstmt = conn.prepareStatement(query);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee name: " + rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
