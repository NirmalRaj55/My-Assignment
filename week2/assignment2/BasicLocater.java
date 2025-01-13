package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocater {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("love");
		driver.findElement(By.xpath("(//textarea[@name='description'])[1]")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("(//input[@value='Create Account'])[1]")).click();
		WebElement displayedSiteName = driver.findElement(By.xpath("//span[text()='LeafTaps']"));
        String actualSiteName = displayedSiteName.getText();
        if ("LeafTaps".equals(actualSiteName)) {
            System.out.println("Test Passed: SiteName is displayed correctly.");
        } else {
            System.out.println("Test Failed: SiteName does not match!");
        };
        driver.close();

	}


}
