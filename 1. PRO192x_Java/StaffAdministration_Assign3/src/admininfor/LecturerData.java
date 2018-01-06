package admininfor;

/* 
 * Specify methods to work with lecturer data
 */

import java.util.ArrayList;
import java.util.Scanner;
import formatinfor.*;

public class LecturerData implements ProceedData {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Lecturer> lecturerList = new ArrayList<Lecturer>();

	public int listSize() {
		return lecturerList.size();
	}
	
	public void arrangeInfor() {
		int n = lecturerList.size();
		Lecturer ltr = new Lecturer();
		
		for(int k=1; k<n; k++) {
			int check = 0;
			
			for(int j=0; j<n-k; j++) {
				if(lecturerList.get(j).getName().compareTo(lecturerList.get(j+1).getName()) > 0) {
					check = 1;
					
					ltr = lecturerList.get(j);
					lecturerList.set(j, lecturerList.get(j+1));
					lecturerList.set(j+1, ltr);
				}
			}
			
			if(check == 0) {
				break;
			}
		}	
	}
	
	public void printInfor() {
		int n = lecturerList.size();
		Lecturer ltr = new Lecturer();
		
		for(int i=0; i<n; i++) {
			ltr = lecturerList.get(i);
			System.out.println(ltr.getName()+" "+ltr.getDepartment()+" "+ltr.getDegree()+" "+
				ltr.getUnits()+" "+ltr.getSalaryRate()+" "+ltr.getAllowance()+" "+ltr.getSalary());
		}
	}
	
	public void inputInfor() {
		lecturerList.add(inputLecturer());		
	}
	
	public int searchInfor() {
		int n = lecturerList.size();
		int result = 0;
		System.out.println("Search for lecturer by Name and Faculty");
		
		System.out.println("Input name:");
		String name = sc.nextLine();
		name = name.trim().toLowerCase();
		
		System.out.println("Input faculty:");
		String department = sc.nextLine().toLowerCase();
		
		for(int i=0; i<n; i++) {
			Lecturer ltr = lecturerList.get(i);
			
			String ltrFullName = ltr.getName().toLowerCase();
			String[] ltrName = ltrFullName.split(" ");
			String ltrDepartment = ltr.getDepartment().toLowerCase();			
			
			if(name.equals(ltrName[ltrName.length - 1]) && department.equals(ltrDepartment)) {
				System.out.println(ltr.getName() +" "+ ltr.getDepartment() +" "+ ltr.getDegree() +" "+ ltr.getSalary());
				result++;
			} else if(name.equals(ltrFullName) && department.equals(ltrDepartment)) {
				System.out.println(ltr.getName() +" "+ ltr.getDepartment() +" "+ ltr.getDegree() +" "+ ltr.getSalary());
				result++;
			}	
		}
		return result;
	}
	
	private Lecturer inputLecturer() {
		Lecturer ltr = new Lecturer();
	
		System.out.println("Input fullname:");
		String name = sc.nextLine();
		ltr.setName(name);
		
		System.out.println("Input Faculty:");
		String department = sc.nextLine();
		ltr.setDepartment(department);
		
		System.out.println("Input teaching-units count in classroom:");
		int units = sc.nextInt();
		sc.nextLine();
		ltr.setUnits(units);
		
		System.out.println("Input salary rate:");
		float salaryRate = sc.nextFloat();
		sc.nextLine();
		ltr.setSalaryRate(salaryRate);
		
		System.out.println("Input Degree:");
		String degree = sc.nextLine();
		ltr.setDegree(degree);
		ltr.setAllowance(degree);
		
		return ltr;
	}
}