package spring_jdbc.employee.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import spring_jdbc.employee.dto.Employee;
@Component
public interface EmployeeDAO {

	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	List<Employee> read();
}
