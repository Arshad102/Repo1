package testingbaba_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library.BaseLibrary;

public class RadioButton_pages extends BaseLibrary {

	public RadioButton_pages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element_Button;
	@FindBy(xpath = "//a[text()='radio buttons']")
	private WebElement Radio_button;
	@FindBy(xpath = "//input[@id='yes']")
	private WebElement Yes_button;
	@FindBy(xpath ="//p[@id='radio-content']")
	private WebElement isTextPresent;

	public void radio_button() {
		Element_Button.click();
		Radio_button.click();
		Yes_button.click();
		String text = isTextPresent.getText();
		Assert.assertEquals(text, "You have selected yes");
	}
}
