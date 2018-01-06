package admininfor;

/* 
 * Specify methods to work with staff data
 */

import java.util.ArrayList;
import java.util.Scanner;
import formatinfor.*;

public class StaffData implements ProceedData {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Staff> staffList = new ArrayList<Staff>();
	
	public int listSize() {
		return staffList.size();
	}
	
	public void inputInfor() {
		staffList.add(inputStaff());			
	}
	
	public void arrangeInfor() {
		int n = staffList.size();
		Staff st = new Staff();
		
		for(int k=1; k<n; k++) {
			int check = 0;
			
			for(int j=0; j<n-k; j++) {
				if(staffList.get(j).getName().compareTo(staffList.get(j+1).getName()) > 0) {
					check = 1;
					
					st = staffList.get(j);
					staffList.set(j, staffList.get(j+1));
					staffList.set(j+1, st);
				}
			}
			
			if(check == 0) {
				break;
			}
		}
	}
	
	public void printInfor() {
		int n = staffList.size();

		for(int i=0; i<n; i++) {
			Staff st = staffList.get(i);
			System.out.println(st.getName()+" "+st.getDepartment()+" "+st.getPosition()+" "+
				st.getWorkDays()+" "+st.getSalaryRate()+" "+st.getAllowance()+" "+ st.getSalary());
		}
	}

	public int searchInfor() {
		int n = staffList.size();
		int result = 0;
		System.out.println("Search for staff by Name and Department");
		
		System.out.println("Input name:");
		String name = sc.nextLine();
		name = name.trim().toLowerCase();
		
		System.out.println("Input department:");
		String department = sc.nextLine().toLowerCase();
		
		for(int i=0; i<n; i++) {
			Staff st = staffList.get(i);
			
			String staffFullName = st.getName().toLowerCase();
			String[] staffName = staffFullName.split(" ");
			String staffDepartment = st.getDepartment().toLowerCase();
			
			if(name.equals(staffName[staffName.length - 1]) && department.equals(staffDepartment)) {
				System.out.println(st.getName() +" "+ st.getDepartment() +" "+ st.getPosition() +" "+ st.getSalary());
				result++;
			} else if(name.equals(staffFullName) && department.equals(staffDepartment)) {
				System.out.println(st.getName() +" "+ st.getDepartment() +" "+ st.getPosition() +" "+ st.getSalary());
				result++;
			}		
		}
		return result;
	}
	
	private Staff inputStaff() {
		Staff st = new Staff();

		System.out.println("Input fullname:");
		String name = sc.nextLine();
		st.setName(name);
		
		System.out.println("Input Department:");
		String department = sc.nextLine();
		st.setDepartment(department);
		
		System.out.println("Input work days count:");
		float workDays = sc.nextFloat();
		sc.nextLine();
		st.setWorkDays(workDays);
		
		System.out.println("Input salary rate:");
		float salaryRate = sc.nextFloat();
		sc.nextLine();
		st.setSalaryRate(salaryRate);
		
		System.out.println("Input position:");
		String position = sc.nextLine();
		st.setPosition(position);
		st.setAllowance(position);
		
		return st;
	}	
}
