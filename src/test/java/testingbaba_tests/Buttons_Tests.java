package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingbaba_pages.Buttons_pages;

public class Buttons_Tests extends Buttons_pages 
{
	Buttons_pages ob;
	@BeforeTest
	public void LaunchChrome() 
	{
	browser(getReaddata("URL"));
	ob = new Buttons_pages();
	}
	@Test 
	public void elementbutton() 
	{
		ob = new Buttons_pages();
		ob.elementbutton();
	}
	@AfterTest
	public void Quit() 
	{
		driver.quit();
	}
}
