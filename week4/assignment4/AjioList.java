package week4.assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		List<WebElement> countProducts = driver.findElements(By.xpath("(//div[@class='brand']/strong)"));
		System.out.println("Count Of Products : "+countProducts.size());
		List<WebElement> listOfBrands = driver.findElements(By.xpath("(//div[@class='brand']/strong)"));
		List<String> brands = new ArrayList<String>();
		for (WebElement each : listOfBrands) {
			String List = each.getText();
			if (!brands.contains(List)) {
				brands.add(List);
			}		
		}
		System.out.println("Brand List of the Bags Displayed : "+brands);
		
		List<WebElement> nameElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
        List<String> bagNames = new ArrayList<>();
        for (WebElement name : nameElements) {
            bagNames.add(name.getText());
        }
        System.out.println("List of Bag Names: " + bagNames);
        System.out.println("Count Of Products : "+bagNames.size());

	}

}
