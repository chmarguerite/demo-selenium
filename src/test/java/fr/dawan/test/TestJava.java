package fr.dawan.test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestJava {
	public static final String USERNAME = "chmarguerite1";
	  public static final String AUTOMATE_KEY = "fAF8B9qEUq5LLxaSaio3";
	  public static final String Url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void testMath() throws InterruptedException, MalformedURLException {
	
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "78.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("name", "Bstack-[Java] Sample Test");

		WebDriver driver = new RemoteWebDriver(new URL(Url), caps);
		driver.get("http://dolibarr.selenium-formation.org/");
		driver.findElement(By.id("username")).sendKeys("jsmith");
		driver.findElement(By.id("password")).sendKeys("Selenium&2018");
		driver.findElement(By.className("button")).click();
		Thread.sleep(4000);


		
		
		driver.quit();
		
	}

}
