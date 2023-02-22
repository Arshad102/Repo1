package testingbaba_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library.BaseLibrary;

public class WebTable_Pages  extends BaseLibrary
{
	public WebTable_Pages() 
	
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element_Button;
	
	@FindBy(xpath="//a[normalize-space()='web tables']")
	private WebElement Web_Tables;
	
	@FindBy(xpath = "//iframe[@src='Webtable.html']")
	private WebElement SwitchFrame;
	
	@FindBy (xpath = "//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement Table_name;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement Table_email;
	
	@FindBy (xpath = "//button[@class='btn btn-success save-btn']")
	private WebElement Save_button;
	
	@FindBy(xpath="//button[@class='btn btn-info btn-xs btn-edit']")
	private WebElement Edit_Button;
	
	@FindBy(xpath="//input[@name='edit_name']")
	private WebElement Edit_Name;
	
	@FindBy(xpath="//input[@name='edit_email']")
	private WebElement Edit_Email;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-xs btn-delete']")
	private WebElement Delete_button;
	

	public void Web_tables() {
		Element_Button.click();
		Web_Tables.click();
		driver.switchTo().frame(SwitchFrame);
		Table_name.sendKeys(getReaddata(1, 0, 1));
		Table_email.sendKeys(getReaddata(1, 1, 1));
		Save_button.click();
		Edit_Button.click();
		Edit_Name.click();
		Edit_Name.sendKeys("Rahul");
		Edit_Email.click();
		Edit_Email.sendKeys("rizwan@gmail.com");
		Delete_button.click();
	}
}