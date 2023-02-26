package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\IntelliJIDEA\\Seleniumjar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
		searchBoxElement.sendKeys("chair");
		WebElement btn1= driver.findElement(By.id("nav-search-submit-button"));
		btn1.click();
	}
}
