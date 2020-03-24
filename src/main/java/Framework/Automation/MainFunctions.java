package Framework.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainFunctions {
	private WebDriver driver;

	public void start_Chrome() {
		try {
			System.setProperty("webdriver.chrome.driver", "target\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println("Found Error : " + e.getMessage());
		}
	}
	public void navigate(String url)
	{
		driver.navigate().to(url);
	}
}
