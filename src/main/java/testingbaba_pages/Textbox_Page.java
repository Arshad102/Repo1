package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library.BaseLibrary;

public class Textbox_Page extends BaseLibrary{

	public Textbox_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element_Button;	
	@FindBy(xpath="//a[text()='text box']")
	private WebElement Textbox_Button;	
	@FindBy(xpath="//input[@id='fullname1']")
	private WebElement FullName;	
	@FindBy(xpath="//input[@id='fullemail1']")
	private WebElement EmailAddress;	
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement Current_Address;	
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement Permanent_Address;	
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement Submit_Button;
	
	public void textBox() {
		Element_Button.click();
		Textbox_Button.click();
		FullName.sendKeys(getReaddata(0, 0, 1));
		EmailAddress.sendKeys(getReaddata(0, 1, 1));
		Current_Address.sendKeys(getReaddata(0, 2, 1));
		Permanent_Address.sendKeys(getReaddata(0, 3, 1));
		Submit_Button.click();
	}
}
