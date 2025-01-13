package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleatLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/form/div/div[1]/div[1]/ul/li[2]/a[2]/em/span/span")).click();
		driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).sendKeys("9176545427");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String lead_id = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/div/a")).getText();
		System.out.println(lead_id);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/div/a")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("(//input[@name='id'])")).sendKeys(lead_id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement actualMsg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String recivedMsg = actualMsg.getText();
		if ("No records to display".equals(recivedMsg)) {
			System.out.println("MSG "+recivedMsg);
			
		} else {
			System.out.println("Leads are Listed");

		};
		driver.close();
	}

}
