package BaseClass.Adactin.BaseClass;

import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sha256WithSM2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.LoginPage;
import com.pom.SearchHotel;

public class runnerClass extends baseClass {
	

  public static WebDriver driver=baseClass.browserLaunch("chrome");
  public static LoginPage sp = new LoginPage(driver);
  public static SearchHotel sh = new SearchHotel(driver);
	
	public static void main(String[] args) {
		
	    driver=getUrl("https://adactinhotelapp.com/");
		
	
		inputValueElement(sp.getUsername(), "mohammedsadiq");
		inputValueElement(sp.getPassword(), "password");
		clickOnElement(sp.getLogin());
		
		dropDownLocation(sh.getSelectLocation(), "Sydney", "Sydney");
	  

		
		
		
	    
	    

		
				
	}
}