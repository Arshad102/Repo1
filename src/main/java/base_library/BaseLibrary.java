package base_library;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Insets2D;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Simple;

public class BaseLibrary {

	String path = "C:\\eclipse-workspace\\TestingBaba\\TestData\\config.properties";
	String excel_file = "C:\\eclipse-workspace\\TestingBaba\\TestData\\excelFile.xlsx";

	public static WebDriver driver;

	public void browser(String URL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
	}

	// -----------------Common Methods--------------------------

	public String getReaddata(String key) 
	{
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);

		} catch (Exception e) 
		{
			System.out.println("this issue is realted to getReaddata" + e);
		}
		return value;
	}

	public String getReaddata(int sheetno, int colno, int rowno) 
	{
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(excel_file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e)
		{
			System.out.println("issue in get read data" + e);
		}
		return value;
	}
	public void doubleclick(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public void rightclick(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	public void changeWindow(int tabno) 
	{
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(set);
		driver.switchTo().window(tabs.get(tabno));
	}
	
	public void elementtobeClickable(WebElement ele, int time) 
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void clicke(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
		public void getScreenshot(String foldername, String filename) 
		{
			String location = System.getProperty("user.dir");
			try 
			{
			String path=location+"\\screenshot\\"+foldername+"\\"+filename+".png";
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			 File src =efw.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File(path));
			} catch (Exception e) {
			}
		}
		public String getdatetime() 
		{
			String date="";
			SimpleDateFormat sdf = new SimpleDateFormat("dd_mm_yyyy hh_MM_ss_a");
			Date db = new Date();
			date = sdf.format(db);
			return date;
		}
		
	public void Click(WebElement ele) 
	{
		ele.click();
	}

	public void selectDropdown(WebElement ele, String text) 
	{
		try {
			Select select = new Select(ele);
			select.selectByVisibleText(text);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	// ===================TearDown================================
	public void shutDown() 
	{
		driver.quit();
	}
	
}
