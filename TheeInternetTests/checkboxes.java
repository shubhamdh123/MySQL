package TheInternetTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkboxes {
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//DELL//eclipse-workspace//AccenturePreparation//bin//ChromeDriver//chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\DELL\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		driver = new ChromeDriver(options);

	}
	@Test
	public void Checkboxes() 
	{
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.cssSelector("input:nth-child(1)")).click();
		Boolean isSelected =driver.findElement(By.cssSelector("input:nth-child(1)")).isSelected();
		Assert.assertTrue(isSelected, "This checkbox should be selected");
				
	}
	
}
