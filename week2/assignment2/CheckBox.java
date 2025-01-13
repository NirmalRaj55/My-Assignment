package week2.assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]")).click();
        WebElement buttonMsg = driver.findElement(By.xpath("//div[@role='alert']//div[@class='ui-growl-message']"));
        String notificaionMsg = buttonMsg.getText();
        Thread.sleep(1000);
        System.out.println("Displayed MSG : "+notificaionMsg);
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div/div/div[2]")).click();
        WebElement status = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p"));
        String triState = status.getText();
        Thread.sleep(1000);
        System.out.println("Choosen TriState is : "+triState);
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
        WebElement ToggleMsg = driver.findElement(By.xpath("//div[@role='alert']//div[@class='ui-growl-message']"));
        String Toggle = ToggleMsg.getText();
        Thread.sleep(1000);
        System.out.println("Displayed MSG : "+Toggle);
        WebElement buttonCheckBox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/span"));
        String buttonDisabled = buttonCheckBox.getText();
        if (!"Disabled".equals(buttonDisabled)) {
        	System.out.println("Button is Enabled");
			
		} else {
			System.out.println("Button is Disabled");
		};
        driver.findElement(By.xpath("//ul[@data-label='Cities'] ")).click();
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
        driver.findElement(By.xpath("//ul[@data-label='Cities'] ")).click();
        List<WebElement> selectedCities = driver.findElements(By.xpath("//ul[@data-label='Cities']//li[@class='ui-selectcheckboxmenu-token ui-state-active ui-corner-all']//span[@class='ui-selectcheckboxmenu-token-label']"));
        for (WebElement city : selectedCities) {
            System.out.println("Selected city: " + city.getText());
        };
        driver.close();
	}

}
