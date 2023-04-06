package spring_jdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import spring_jdbc.employee.dao.EmployeeDAO;
import spring_jdbc.employee.dto.Employee;
import spring_jdbc.employee.rowmapper.EmployeeRowMapper;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee value(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id = " + id;
		int result = jdbcTemplate.update(sql);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=" + id;

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new EmployeeRowMapper());
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
}
