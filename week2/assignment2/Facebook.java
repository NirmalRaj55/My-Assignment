package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("Testing");
		driver.findElement(By.xpath("(//input[@name='lastname'])[1]")).sendKeys("Selenium");
		WebElement dob = driver.findElement(By.name("birthday_day"));
		Select date = new Select(dob);
		date.selectByIndex(20);
		WebElement dom = driver.findElement(By.name("birthday_month"));
		Select month = new Select(dom);
		month.selectByIndex(3);
		WebElement doy = driver.findElement(By.name("birthday_year"));
		Select year = new Select(doy);
		year.selectByIndex(20);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("W0nd3r#1");
		driver.close();
	}

}
