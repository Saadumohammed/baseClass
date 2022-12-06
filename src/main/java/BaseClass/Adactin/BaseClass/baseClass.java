package BaseClass.Adactin.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class baseClass {
	
	public static WebDriver driver;
	
	//1
	public static WebDriver browserLaunch(String type) {
		
     if (type.equalsIgnoreCase("chrome")) {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
		
	}else if (type.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	  driver.manage().window().maximize();
	  
	  return driver;
		
	}
	//2
	public static WebDriver getUrl(String url) {
       driver.get(url);
	return driver;
	}
	
	//3
	public static void inputValueElement(WebElement element,String pass) {
		element.sendKeys(pass);
		
	}
	
	//4
	public static void clickOnElement(WebElement element) {
		element.click();
		}
	//5
     public static void dropDownLocation(WebElement element, String options, String value ) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase(value)) {
			s.selectByValue(value);
			}else if (options.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			}else if (options.equalsIgnoreCase("index")) {
                   s.selectByIndex(Integer.parseInt(value));
			}  
	}
    
}