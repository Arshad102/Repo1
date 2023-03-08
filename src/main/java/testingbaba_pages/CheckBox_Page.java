package testingbaba_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_library.BaseLibrary;

public class CheckBox_Page extends BaseLibrary {

	public CheckBox_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element_Button;
	
	@FindBy(xpath="//a[text()='check box']")
	private WebElement Checkbox_Button;
	
	@FindBy(xpath = "//iframe[@src='Checkbox.html']")
	private WebElement Switchto_checkbox;
	
	@FindBy(xpath="//input[@id='myCheck']")
	private WebElement Checkbox_Mobile;
	
	@FindBy(xpath="//h6[@id='text']")
	private WebElement text;
	
	public void checkBox() {
		Element_Button.click();
		Checkbox_Button.click();
		driver.switchTo().frame(Switchto_checkbox);
		Checkbox_Mobile.click();
		String texte = text.getText();
		Assert.assertEquals(texte, "You are selected Mobile");
	}
}