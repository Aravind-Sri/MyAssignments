package myAssignments.week3.day3;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection j = new JavaConnection();
		j.executeQuery();
		j.connect();
		j.disconnect();
		j.executeUpdate();

	}

}
