package Notes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		FileInputStream file = new FileInputStream("F:\\Excel\\Registration.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		for(int row=1; row<=rowCount; row++) {
			
			XSSFRow current_rowRow = sheet.getRow(row);
			
			String first_name = current_rowRow.getCell(0).getStringCellValue();
			String Last_name = current_rowRow.getCell(1).getStringCellValue();
			String Phone1 = current_rowRow.getCell(2).toString();
			String Phone = Phone1.toString(); 
			String Email = current_rowRow.getCell(3).getStringCellValue();
			String Address = current_rowRow.getCell(4).getStringCellValue();
			String City = current_rowRow.getCell(5).getStringCellValue();
			String State = current_rowRow.getCell(6).getStringCellValue();
			String Pincode = current_rowRow.getCell(7).toString();
			String Country = current_rowRow.getCell(8).getStringCellValue();
			String UserName = current_rowRow.getCell(9).getStringCellValue();
			String Password = current_rowRow.getCell(10).getStringCellValue();
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			driver.findElement(By.name("firstName")).sendKeys(first_name);
			driver.findElement(By.name("lastName")).sendKeys(Last_name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(Pincode);
			
			Select dropcountry = new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			driver.findElement(By.name("submit")).click();
			
			if(driver.getPageSource().contains("Thank you for registering")) {
				System.out.println("Registration completed for "+row+" record");
			}else {
				System.out.println("Registration failed for "+row+" record");
			}
			
			
		}
		
		System.out.println("Data Driven test completed");
		driver.close();
		driver.quit();
		
		file.close();

	}

}
