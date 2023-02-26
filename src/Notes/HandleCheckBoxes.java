package Notes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        
        // 1) select specific checkbox
       // driver.findElement(By.xpath("//input[@id='monday']")).click();
        
        // 2) select all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        
        // for loop
       /* for(int i=0;i<=checkboxes.size();i++) {
        	checkboxes.get(i).click();
        } */
        
        // enhanced for loop
       /* for(WebElement chbox:checkboxes) {
        	chbox.click();
        } */
        
        // 3) select checkboxes by choice
       /* for(WebElement chbox:checkboxes) {
        String checkboxname =	chbox.getAttribute("id");
        if(checkboxname.equals("monday") || checkboxname.contains("sunday")) {
        	chbox.click();
        }
        } */
        
        // 4) select last 2 checkboxes
         int totalCheckBoxes = checkboxes.size();
       /* for(int i=totalCheckBoxes-2;i<totalCheckBoxes;i++) {
        	checkboxes.get(i).click();
        } */
        
        // 5) select first 3 checkboxes
        for(int i=0;i<totalCheckBoxes;i++) {
        	if(i<3) {
        		checkboxes.get(i).click();
        	}
        }
        		
	}

}
