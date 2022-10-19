package Basics_P1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04 {
	
	WebDriver D;
	String url="https://www.saucedemo.com";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "enter-your-path-here\chromedriver_win32\\chromedriver.exe");
		D= new ChromeDriver();
		D.get(url);
		D.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		D.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);

	}

}
