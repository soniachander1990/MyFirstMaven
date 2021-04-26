package testingtestngwithmaven;

import org.testng.annotations.Test;

public class profiles {

	
	@Test
	public void employeeProfile() {
		System.out.println("This is employee profile");
	}
	
	@Test
	public void managerProfile() {
		System.out.println("manager profile");
		System.out.println("Harman profile");
	}
}
