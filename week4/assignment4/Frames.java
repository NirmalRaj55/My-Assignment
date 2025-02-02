package week4.assignment4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(1);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        String result = driver.findElement(By.id("demo")).getText();
        System.out.println("Result after Alert Action : "+result);		
	}

}
