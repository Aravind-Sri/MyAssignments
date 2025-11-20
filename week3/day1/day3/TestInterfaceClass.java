package myAssignments.week3.day3;

public class TestInterfaceClass implements DatabaseConnection {

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
		
		TestInterfaceClass s = new TestInterfaceClass();
		s.connect();
		s.disconnect();
		s.executeUpdate();

	}

}
