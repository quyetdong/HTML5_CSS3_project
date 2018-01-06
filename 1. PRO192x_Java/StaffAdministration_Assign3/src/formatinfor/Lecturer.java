package formatinfor;

/* 
 * Specify fields of a lecturer
 */

public class Lecturer extends Employee {
	private String degree;
	private int units;
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	public void setAllowance(String degree) {
		if(degree == "bachelor") {
			allowance = 300;
		} else if(degree == "master") {
			allowance = 500;
		} else if(degree == "doctor") {
			allowance = 1000;
		} else {
			allowance = 0;
		}

	}
	
	public float getSalary() {
		return (salaryRate*730 + allowance + units*45);
	}
}
