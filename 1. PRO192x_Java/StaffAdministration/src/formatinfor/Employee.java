package formatinfor;

/* 
 * Abstract class
 * Specify fields of a employee in general
 */

public abstract class Employee {
	String name;
	String department;
	float allowance;
	float salaryRate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(float salaryRate) {
		this.salaryRate = salaryRate;
	}

	public float getAllowance() {
		return allowance;
	}
	
	public abstract void setAllowance(String position);
	public abstract float getSalary();
}
