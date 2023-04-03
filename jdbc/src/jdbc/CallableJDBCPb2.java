package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallableJDBCPb2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");) {
			System.out.println("Enter employee ID: ");
			int emp_id = sc.nextInt();
			String sql = "call proc_dname(" + emp_id + ")";
			CallableStatement stmt = conn.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee Department: " + rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
