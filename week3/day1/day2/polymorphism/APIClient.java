package myAssignments.week3.day2.polymorphism;

public class APIClient {
	
	void sendRequest(String endpoint) {
		
		System.out.println("API endpoint: " +endpoint);
		
	}
	
	void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println("API endpoint: " +endpoint +" status is " +requestBody +" Boolean value is: " +requestStatus);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient ap = new APIClient();
		ap.sendRequest("Home");
		ap.sendRequest("Home", "200", true);

	}

}
