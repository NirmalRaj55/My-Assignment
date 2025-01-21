package week3.assignment3;

public class APIClient {
	public void endpointurl (String endpoint) {
		System.out.println(endpoint);
		
	}
public void requestBody (String endpoint,String requestBody, boolean requestStatus) {
	 System.out.println(endpoint);
	  System.out.println(requestBody);
	  System.out.println(requestStatus);
		
	}
	public static void main(String[] args) {
		APIClient request = new APIClient();
		request.endpointurl("/api/1");
		request.requestBody("/api/2", "data", false);
		

	}

}
