package Utils;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.Homepage;

public class Base {
public  WebDriver driver;
   @BeforeSuite
   public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "Webdriver//chromedriver");
		driver = new ChromeDriver();
		// Maximize window
		//driver.manage().window().maximize();
		//launch the browser
		driver.get("https://www.mercurytravels.co.in/");
	
		
	}

   public Homepage Login(){
	   Homepage homepage = new Homepage(driver);
	   return PageFactory.initElements(driver, Homepage.class);
   }

	public String getPath() {
		String path = "";
		final File file = new File("");
		final String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");
		return path;
	}

	public void MouseHover(WebElement elment){
		Actions action =new Actions(driver) ;
		action.moveToElement(elment).build().perform();
		
	}
	
	public  void MouseHoverAndClick(WebElement movetoelement , WebElement clicktoelent) throws Exception{
		Actions action =new Actions(driver) ;
		action.moveToElement(movetoelement);
		
			Thread.sleep(1000);
			action.moveToElement(clicktoelent);
		action.doubleClick(clicktoelent).build().perform();
		
			Thread.sleep(1000);
		
	}







}
