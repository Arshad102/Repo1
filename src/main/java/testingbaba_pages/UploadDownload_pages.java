package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library.BaseLibrary;

public class UploadDownload_pages extends BaseLibrary
{
	String path = "C:\\eclipse-workspace\\TestingBaba\\TestData\\excelFile.xlsx";
	public UploadDownload_pages() 
	{
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement Element_Button;
	
	@FindBy(xpath="//*[@href='#tab_8']")
	private WebElement UploadDownload_Button;
	
	@FindBy(xpath="//*[text()='Select a file']")
	private WebElement ChooseFile_Button;
	
	public void ClickonElements() 
	{ 
		Element_Button.click();
		UploadDownload_Button.click();
	}
	public void selectfile() 
	{
		try 
		{
			ChooseFile_Button.click();
			Thread.sleep(3000);
			uploadfile(path);
			getScreenshot("passed", "fileupload");
		} catch (Exception e) {
			System.out.println("error in selectfile"+e);
		}
		
	}
}
