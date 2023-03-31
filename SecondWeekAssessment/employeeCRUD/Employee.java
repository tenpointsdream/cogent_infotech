package employeeCRUD;

public class Employee {
	private int employeeNo;
	private String employeeName;
	private String employeeAddress;
	private String employeeEmail;
	private float employeeSalary;

	public Employee(int employeeNo, String employeeName, String employeeAddress, String employeeEmail,
			float employeeSalary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
