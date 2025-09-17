package TheInternetTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver",
					"C://Users//DELL//eclipse-workspace//AccenturePreparation//bin//ChromeDriver//chromedriver-win64//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Users\\DELL\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

			WebDriver driver = new ChromeDriver(options);

		}

	}

