package practice;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","F:\\IntelliJIDEA\\Seleniumjar\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.makemytrip.com/");
	   driver.manage().window().maximize();
	   WebElement fromElement = driver.findElement(ByXPath.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span"));
	   fromElement.click();
	   WebElement autoSuggestElement= driver.findElement(ByXPath.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	   autoSuggestElement.sendKeys("sydney");
	   
	   
}
}
