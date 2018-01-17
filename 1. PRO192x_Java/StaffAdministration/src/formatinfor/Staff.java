package formatinfor;

/* 
 * Specify fields of a staff
 */

public class Staff extends Employee {
	private float workDays;
	private String position;
	
	public float getWorkDays() {
		return workDays;
	}

	public void setWorkDays(float workDays) {
		this.workDays = workDays;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setAllowance(String position) {
		if(position.equals("staff")) {
			allowance = 500;			
		}
		else if(position.equals("deputy")) {
			allowance = 1000;
		}
		else if(position.equals("head")) {
			allowance = 2000;
		}
		else {
			allowance = 0;
		}			
	}
	
	public float getSalary() {
		return (getSalaryRate()*730 + getAllowance() + getWorkDays()*30); 
	}
}
