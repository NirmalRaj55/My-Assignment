package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
        String title = driver.getTitle();
        if ("Dashboard".equals(title)) {
            System.out.println("Test Passed: Title is displayed correctly.");
        } else {
            System.out.println("Test Failed: Title does not match!");
        };
        driver.navigate().back();
        WebElement buttonStatus = driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]"));
        if (buttonStatus.isEnabled()) {
            System.out.println("Button is enabled.");
        } else {
            System.out.println("Button is disabled.");
        };
        WebElement buttonLocation = driver.findElement(By.xpath("(//button[span[text()='Submit']])[1]"));
        Point Location = buttonLocation.getLocation();
        int x = Location.getX();
        int y = Location.getY();
        System.out.println("Location From X :" + x);
        System.out.println("Location From Y :" + y);
        WebElement buttonColor = driver.findElement(By.xpath("(//button[span[text()='Save']])[1]"));
        String background = buttonColor.getCssValue("background-color");
        System.out.println("Find the Save button color in : " +background);
        WebElement buttonHeight = driver.findElement(By.xpath("(//button[span[text()='Submit']])[2]"));
        Dimension height = buttonHeight.getSize();
        System.out.println("Find the height and width of this button : "+height);
        driver.close();
              
	}

}
