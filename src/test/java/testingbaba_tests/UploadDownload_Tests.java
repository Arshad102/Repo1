package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testingbaba_pages.UploadDownload_pages;

public class UploadDownload_Tests extends UploadDownload_pages
{
	UploadDownload_pages ob;
	@BeforeTest
	public void launchChrome() 
	{
		browser(getReaddata("URL"));
	}
	@Test
	public void ClickElementButton() 
	{
		ob = new UploadDownload_pages();
		ob.ClickonElements();
		ob.selectfile();
	}
	@AfterTest
	public void quit() 
	{
		driver.quit();
	}
	
}
