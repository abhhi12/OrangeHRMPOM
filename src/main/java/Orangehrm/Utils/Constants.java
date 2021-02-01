package Orangehrm.Utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	
	public static final int FOOTER_COUNT = 1;
	public static final int HEADER_COUNT = 6;
	public static final String 	EXEL_SHET = "Sheet3";
	public static final int MODULAR_SOLUTION = 8;
	//public static final String EMP_COUNT = "401-450";
	//public static final String IND_COUNT = "Travel";
	//public static final String COU_COUNT = "India";
	
	public static List<String> VerifyModularSolution;
	
	public static List<String> getExpectedModularSolution() {
		VerifyModularSolution = new ArrayList<String>();
		VerifyModularSolution.add("Request Desk");
		VerifyModularSolution.add("Personnel Information Management (PIM)");
		VerifyModularSolution.add("Leave/Time-Off Management");
		VerifyModularSolution.add("Time & Attendance Management");
		VerifyModularSolution.add("Performance");
		VerifyModularSolution.add("Recruitment");
		VerifyModularSolution.add("System Administration & User Roles");
		VerifyModularSolution.add("Succession and Development");
		
		return VerifyModularSolution;
		
	}
	
	
}
