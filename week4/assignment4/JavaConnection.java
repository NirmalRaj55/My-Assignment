package week4.assignment4;

public class JavaConnection implements DatabseConnection{

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update");
		
	}
	public static void main(String[] args) {
		JavaConnection connect = new JavaConnection();
		connect.connect();
		connect.disconnect();
		connect.executeUpdate();
	}

}
