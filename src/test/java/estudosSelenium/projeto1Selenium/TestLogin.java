package estudosSelenium.projeto1Selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	@Test
	public void realizarLogin() {
		try {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.navigate().to("http://localhost:8080/login");
		Thread.sleep(2000);
		chrome.findElement(By.cssSelector("input[type='text']")).sendKeys("user");
		Thread.sleep(2000);
		chrome.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		chrome.findElement(By.cssSelector("input[type='submit']")).click();
		Assertions.assertEquals(chrome.getCurrentUrl(), "http://localhost:8080/");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
