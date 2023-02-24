package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library.BaseLibrary;

public class Buttons_pages extends BaseLibrary 
{
	public Buttons_pages() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element_Button;
	
	@FindBy (xpath="//a[@href='#tab_5']")
	private WebElement Buttons;
	
	@FindBy(xpath="//button[@ondblclick='doubletext()']")
	private WebElement Doubleclick;
	
	@FindBy(xpath="//button[@oncontextmenu='righttext()']")
	private WebElement right_click;
	
	@FindBy(xpath="//button[@onclick='clicktext()']")
	private WebElement Singleclick;
	
	public void elementbutton() 
	{
		Element_Button.click();
		Buttons.click();
		doubleclick(Doubleclick);
		rightclick(right_click);
		getScreenshot("passed", "ClickonButtons");
		Singleclick.click();	
	}
}
