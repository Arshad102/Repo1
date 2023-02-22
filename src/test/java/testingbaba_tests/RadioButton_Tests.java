package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingbaba_pages.RadioButton_pages;

public class RadioButton_Tests extends RadioButton_pages  
{
	RadioButton_pages ob;
	@BeforeTest
	public void launchChrome() {
		browser(getReaddata("URL"));
	}
	@Test
	public void isRadioButton_clicked() {
		ob= new RadioButton_pages();
		ob.radio_button();
	}
	@AfterTest
	public void Teardown() {
		driver.quit();
	}
}
