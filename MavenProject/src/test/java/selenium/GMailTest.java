package selenium;

import java.sql.Driver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GMailTest {
WebDriver driver = null;
	@Before	
	public void setup()
	{
		if (driver!= null)
		{
		System.out.println("Called gmail!!!");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saba\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		}
	}
	
	@Test
	public void gmail() {
		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.navigate();
			driver.quit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@Test
	public void tmobile() {
driver.get("www.tmobile.com");
	}

}
