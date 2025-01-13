package week2.assignment2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement radioButton = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[12]"));
		radioButton.click();
		if (radioButton.isSelected()) {
            System.out.println("Radio button is selected.");
        } else {
            System.out.println("Radio button is not selected.");
        };
        WebElement ageGroup = driver.findElement(By.xpath("//input[@type='radio' and @value='21-40 Years']"));
        if (ageGroup.isSelected()) {
            System.out.println("Radio button is selected.");
        } else {
            System.out.println("Radio button is not selected.");
        };
	}

}
