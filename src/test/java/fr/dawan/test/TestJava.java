package fr.dawan.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {
	
	@Test
	public void testMath() throws InterruptedException {
		assertTrue(2>1);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://dolibarr.selenium-formation.org/");
		driver.findElement(By.id("username")).sendKeys("jsmith");
		driver.findElement(By.id("password")).sendKeys("Selenium&2018");
		driver.findElement(By.className("button")).click();
		Thread.sleep(4000);


		
		
		driver.quit();
		
	}

}
