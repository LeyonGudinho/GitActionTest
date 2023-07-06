package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testSeleniumTest {
	@Test
	public void f() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
	}
}
