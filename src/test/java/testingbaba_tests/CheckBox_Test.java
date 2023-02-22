package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingbaba_pages.CheckBox_Page;

public class CheckBox_Test extends CheckBox_Page {

	CheckBox_Page ob;	
	@BeforeTest
	public void LaunchChrome() {
		browser(getReaddata("URL"));
	}
	
	@Test (priority = 1)
	public void isCheckBox_checked() {
			ob = new CheckBox_Page();
			ob.checkBox();
	}
	
    @AfterTest
    public void teardown() {
    	driver.quit();
    }
}
