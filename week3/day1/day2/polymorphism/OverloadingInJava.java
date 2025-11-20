package myAssignments.week3.day2.polymorphism;

public class OverloadingInJava {
	
	void reportStep(String mes, String status){
		
		System.out.println("Report steps: " +mes + " message is " +status);
		
	}
	
	void reportStep(String mes, String status, boolean snap){
		
		System.out.println("Report steps plus snaps: " +mes +" message is " +status +" Boolean value is: " +snap);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingInJava a = new OverloadingInJava();
		a.reportStep("Hey", "Active");
		a.reportStep("Hello!", "Inactive", false);

	}

}
