package main;

/* 
 * Execute management 0f staff and lecturer data combination
 */

import java.util.Scanner;

import admininfor.LecturerData;
import admininfor.ProceedData;
import admininfor.StaffData;

public class AdminData implements ProceedData{
	private Scanner sc = new Scanner(System.in);
	private StaffData staff = new StaffData();
	private LecturerData lecturer = new LecturerData();
	
	public void arrangeInfor() {
		if(staff.listSize() > 1) {
			staff.arrangeInfor();
		}
		if(lecturer.listSize() > 1) {
			lecturer.arrangeInfor();
		}
	}
	
	public void inputInfor() {
		System.out.println("Type the number of employees to input:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n;) {
			System.out.printf("Employee number %d: \n", i+1);
			System.out.println("Choose to input staff or input lecturer: 1.staff, 2.lecturer");
			
			int opt = inpInt("Choose again to input: 1.staff, 2.lecturer");
			
			if(opt == 1) {
				staff.inputInfor();
				i++;
			} else {
				lecturer.inputInfor();
				i++;
			}
		}
	}

	public int searchInfor() {
		System.out.println("Choose to search staff or lecturer: 1.staff, 2.lecturer");
		int result = 0;
		
		int opt = inpInt("Error, choose 1 or 2 to search");
		
		if(opt == 1) {
			result += staff.searchInfor();
		} else {
			result += lecturer.searchInfor();
		}	
		
		if(result == 0) {
			System.out.println("Not found!");
		}
		return result;
	}

	public void printInfor() {
		System.out.println("Choose to print staff or lecturer list: 1.staff list, 2.lecturer list");

		int opt = inpInt("Error, choose 1 or 2 to print a list");
			
		if(opt == 1) {
			staff.printInfor();
		} else {
			lecturer.printInfor();
		}
	}
	
	int inpInt(String str) {
		int opt = 0;
		
		while(opt != 1 && opt != 2) {
			try {
				opt = sc.nextInt();
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println(str);
				sc.nextLine();
			}
		}	
		return opt;
	}
	
}
