package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingbaba_pages.WebTable_Pages;

public class WebTables_Tests extends WebTable_Pages
{
	WebTable_Pages ob;
	@BeforeTest
	public void launchurl() {
		browser(getReaddata("URL"));
	}
	@Test
	public void isWebtable_textsent() {
		ob=new WebTable_Pages();
		ob.Web_tables();
	}
	@AfterTest
	public void Teardown() {
		driver.quit();
	}
}

