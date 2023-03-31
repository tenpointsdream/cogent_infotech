package employeeCRUD;

import java.util.List;

public interface EmployeeDAO {
	void create(List<Employee> employees, Employee employee);
	void readAll(List<Employee> employees);
	void search(List<Employee> employees, int id);
	void update(List<Employee> employees, int id);
	void delete(List<Employee> employees, int id);
	void sort(List<Employee> employees);
}
