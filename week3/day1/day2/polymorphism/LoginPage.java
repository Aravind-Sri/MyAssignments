package myAssignments.week3.day2.polymorphism;

public class LoginPage extends BasePage {
	
	@Override
	void performCommonTasks(String mes) {

		System.out.println("LoginPage: Performing login-specific common tasks: " +mes);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginPage l = new LoginPage();
		l.performCommonTasks("Overridden");

	}

}
