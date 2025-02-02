package week4.assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandel {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> childWindow = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(listWindow.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		driver.switchTo().window(listWindow.get(0));
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	    childWindow = driver.getWindowHandles();
	    listWindow=new ArrayList<String>(childWindow);
	    driver.switchTo().window(listWindow.get(1));
	    driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
	    driver.switchTo().window(listWindow.get(0));
	    driver.findElement(By.className("buttonDangerous")).click();
	    Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        String title = driver.getTitle();
        System.out.println("Title Of the Page : "+title);
	}

}
