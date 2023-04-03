package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Problem1JDBC {

	public static void main(String[] args) {
		String query = "insert into DEPT(emp_id, emp_name, emp_age, emp_salary, emp_dept) values (1001, 'Khoa', 23, 100000, 30)";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				Statement pstmt = conn.createStatement();) {
			int rows = pstmt.executeUpdate(query);
			System.out.println("Rows updated: " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
