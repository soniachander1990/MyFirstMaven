package testingtestngwithmaven;

import org.testng.annotations.Test;

public class employeeLogin {

	@Test
	public void employeeLogin() {
		System.out.println("This is employee profile");
	}
	
	@Test
	public void managerLogin() {
		System.out.println("This is manager profile");
	}
	
	@Test
	public void accountantProfile() {
		System.out.println("This is accountant profile");
	}
}
