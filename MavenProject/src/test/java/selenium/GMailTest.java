package selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GMailTest {

	@Test
	public void gmail() {
		try {
			System.out.println("Called gmail!!!");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saba\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.google.com");
			driver.switchTo().defaultContent();
			driver.manage().window().maximize();
			driver.navigate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
