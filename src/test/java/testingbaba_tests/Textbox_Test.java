package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testingbaba_pages.Textbox_Page;

public class Textbox_Test extends Textbox_Page{

	Textbox_Page ob;
	String path= "https://www.testingbaba.com/old/";
	
	@BeforeTest
	public void LaunchChrome() {
		browser(path);
	}
	
	@Test(priority = 1)
	public void isTexbox_textSent() {
		ob = new Textbox_Page();
		ob.textBox();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
