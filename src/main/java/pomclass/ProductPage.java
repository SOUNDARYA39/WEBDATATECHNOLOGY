package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='menu-link'])[10]")
	private WebElement product;
	
	@FindBy(xpath="(//a[@class='submit add'])[1]")
	private WebElement addcat;
	
	@FindBy(id="description")
	private WebElement name;
	

	@FindBy(xpath = "//a[@class='submit save']")
	private WebElement save;
	
	@FindBy(xpath = "(//a[@class='submit add'])[2]")
	private WebElement createTax;
	
	@FindBy(id="product.descriptions[0].content")
	private WebElement desc;
	
	
	@FindBy(id="product.number")
	private WebElement productCode;
	
	@FindBy(id="productPrice")
	private WebElement price;
	
	@FindBy(xpath="(//a[@class='submit add'])[1]")
	private WebElement addpri;
	
	@FindBy(xpath = "(//a[@class='submit save'])[1]")
	private WebElement savepri;
	
	@FindBy(xpath="//div[@class='menu-3 dropbtn']")
	private WebElement logoutUser;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logo;
	
	
	
	public WebElement getLogo() {
		return logo;
	}

	public WebElement getLogoutUser() {
		return logoutUser;
	}

	public WebElement getSavepri() {
		return savepri;
	}

	public WebElement getAddpri() {
		return addpri;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getProductCode() {
		return productCode;
	}

	public WebElement getDesc() {
		return desc;
	}

	public WebElement getCreateTax() {
		return createTax;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getAddcat() {
		return addcat;
	}

	public WebElement getProduct() {
		return product;
	}
	
	public void productclick()
	{
		product.click();
	}
	
	public void addCategory()
	{
		addcat.click();
	}
	
	public void nametextfield(String Names)
	{
		name.sendKeys(Names);
	}
	
	public void saveButton()
	{
		save.click();
	}
	
	public void createTaxInfo()
	{
		createTax.click();
	}
	
	public void descandprocode(String Description, String Procode)
	{
		desc.sendKeys(Description);
		productCode.sendKeys(Procode);
		
	}
	
	public void addprice()
	{
		price.sendKeys("1");
		addpri.click();
		savepri.click();
		
	}
	
	public void logout()
	{
		logo.click();
	}

}
