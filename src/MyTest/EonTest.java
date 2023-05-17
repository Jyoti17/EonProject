package MyTest;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;


public class EonTest {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
	 driver = new ChromeDriver();
	 driver.get("https://qa.app.eongroup.co/login/?next=dashboard ");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	}
	@Test
	public void login()
	{
		
		driver.findElement(By.name("username"));
		driver.findElement(By.name("password"));
		
		
	}
	
	@AfterMethod 
	public void tearDown()
	{
		
		driver.quit();
	}

}
