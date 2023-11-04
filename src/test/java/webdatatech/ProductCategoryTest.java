package webdatatech;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import baseclass.Generic_Utility;
import pomclass.ProductPage;

public class ProductCategoryTest extends BaseClass {
	
	@Test()
	
	public void productCategoryTest() throws InterruptedException
	{
		Random ran = new Random();
		int data = ran.nextInt(1000);
		ProductPage pp = new ProductPage(driver);
		pp.productclick();
		
		pp.addCategory();
		
		WebElement typedropdown = driver.findElement(By.id("orderLineTypeId"));
		
		//typedropdown.sendKeys("Tax");
		Generic_Utility gu = new Generic_Utility();
		gu.handleDropDown(typedropdown, "Tax");
		pp.nametextfield("Cellular"+data);
		pp.saveButton();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(50);
		
		pp.createTaxInfo();
		
		pp.descandprocode("Local Call", "Local Call");
		
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		pp.addprice();
		Thread.sleep(10);
		
		WebElement logoutuser = driver.findElement(By.xpath("//span[text()='Hello David!']"));
		Thread.sleep(40);
		gu.mousehover(driver, logoutuser);
		
		Thread.sleep(100);
		
		//pp.logout();
		
		
	}
}
