package Basics_P1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04 {

	String Username = "standard_user";
	String Pass = "secret_sauce";
	String url1 = "https://www.saucedemo.com/inventory.html";

	WebDriver D;
	String url = "https://www.saucedemo.com";
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jignesh.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		D = new ChromeDriver();
		D.get(url);
		D.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception {
		D.close();
		D.quit();
	}
	
	@Test
	public void test() throws InterruptedException {


		D.findElement(By.id("user-name")).sendKeys(Username);
		Thread.sleep(3000);
		D.findElement(By.id("password")).sendKeys(Pass);
		Thread.sleep(3000);
		D.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		String url2 = D.getCurrentUrl();
		
		if (url2 == url1) {
			System.out.println("login successful");
		}
		
		D.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		
		D.findElement(By.id("logout_sidebar_link")).click();
	}
}
		
		
		
