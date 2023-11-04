package pomclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWeb {
	private WebDriver driver;
	public LoginPageWeb(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(name="j_username")
	private WebElement user;
	
	@FindBy(name="j_password")
	private WebElement passwordtextfield;
	
	@FindBy(id="j_client_id")
	private WebElement dropdown;
	
	@FindBy(id="login-button")
	private WebElement loginb;

	
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLoginb() {
		return loginb;
	}

	public WebElement getUser() {
		return user;
	}
	
	public void loginpa(String Username, String Password)
	{
		user.sendKeys(Username);
		passwordtextfield.sendKeys(Password);
		dropdown.sendKeys("Technical Interview");
		loginb.click();
		
	}

}
