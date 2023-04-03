package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Problem2JDBC {

	public static void main(String[] args) {
//		String query = "update DEPT set emp_salary= " + new_salary+ " where emp_id=" + emp_id;
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		Scanner sc = new Scanner(System.in);
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");
				Statement stmt = conn.createStatement();) {
			System.out.println("Enter employee ID: ");
			int emp_id = sc.nextInt();
			System.out.println("Enter new salary");
			int new_salary = sc.nextInt();
			stmt.execute("update DEPT set emp_salary=" + new_salary + " where emp_id=" + emp_id);
			System.out.println("Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
