package SeleniumMavenJenkinsIntegration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 
{
	
	@Test
	public void testCase03() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver108\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("password");
		driver.quit();
		
	}
	
	
    
}
