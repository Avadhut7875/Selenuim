package practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript2 {
	@BeforeTest
	public void login() {
		System.out.println("Login Succussful");
	}
	@AfterTest
	public void logout() {
		System.out.println("Loguot Successful");
	}
  @Test
	public void test() {
		System.out.println("test method");
	}
}
