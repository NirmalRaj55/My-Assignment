package week3.assignment3;

public class LoginTestData extends TestData {
	
    public void enterUsername(String username) {
    	System.out.println("UserName : "+username);
		
	}
    public void enterPassword(String password) {
    	System.out.println("Password : "+password);
	}


	public static void main(String[] args) {
		LoginTestData Login = new LoginTestData();
		Login.enterCredentials();
		Login.enterUsername("admin");
		Login.enterPassword("************");
		Login.navigateToHomePage();
		
	}

}
