package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 * //String query =
		 * "insert into employee(emp_no, emp_name, emp_salary) values (105, 'Tom', 191919)"
		 * ; String connectionUrl = "jdbc:mysql://localhost:3306/test"; try (Connection
		 * conn = DriverManager.getConnection(connectionUrl, "root",
		 * "+-Dmiralk25051998"); // PreparedStatement pstmt =
		 * conn.prepareStatement(query); Statement stmt = conn.createStatement();) {
		 * 
		 * ResultSet rs = stmt.executeQuery("select * from employee"); ResultSetMetaData
		 * rsMetaData = rs.getMetaData(); int numberOfCol = rsMetaData.getColumnCount();
		 * System.out.println("Number of columns: " + numberOfCol); for (int i = 1; i <=
		 * numberOfCol; i++) { String colName = rsMetaData.getColumnName(i);
		 * System.out.println("Column number [" + i + "]\tColumn name: " + colName);
		 * System.out.println(rsMetaData.getTableName(numberOfCol)); }
		 * 
		 * // ResultSet rs = pstmt.executeQuery(); // int rows =
		 * stmt.executeUpdate(query); // System.out.println("Rows inserted: " + rows);
		 * // int rows = stmt.
		 * executeUpdate("update employee set emp_salary=19000 where emp_name='Tom'");
		 * // int rows =
		 * stmt.executeUpdate("delete from employee where emp_name='Khoa'"); //
		 * System.out.println("Rows updated: " + rows); // while (rs.next()) { //
		 * System.out.println("Employee ID: " + rs.getInt("emp_no")); //
		 * System.out.println("Employee Name: " + rs.getString("emp_name")); //
		 * System.out.println("Employee Salary: " + rs.getInt("emp_salary")); //
		 * System.out.println(); // } } catch (Exception e) { e.printStackTrace(); }
		 */
		String sql = "call retrieve_people";
		String connectionUrl = "jdbc:mysql://localhost:3306/randomdb";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "+-Dmiralk25051998");) {
			CallableStatement stmt = conn.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("First name: " + rs.getString(2));
				System.out.println("Last name: " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
