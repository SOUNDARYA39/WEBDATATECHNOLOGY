package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomclass.LoginPageWeb;
import pomclass.ProductPage;

public class BaseClass {
	
	public WebDriver driver =null;
	
	@BeforeSuite()
	public void beforeSuite()
	{
		
	}
	
	@BeforeClass()
	public void beforeClass()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://139.84.162.246:8080/login/auth");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod()
	public void beforeMethod()
	{
		LoginPageWeb lp = new LoginPageWeb(driver);
		lp.loginpa("admin", "Soundarya@2023");
		
				
	
		
	}
	
	


	@AfterMethod()
	public void afterMethod()
	{
		ProductPage pp = new ProductPage(driver);
		pp.logout();
	}
	@AfterClass()
	public void afterClass()
	{
		driver.quit();
	}

}
