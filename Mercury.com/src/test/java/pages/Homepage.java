package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utils.Base;
/*subclass extends superclass Constructors are 
not members, so they are not inherited by subclasses, 
but the constructor of the superclass
can be invoked from the subclass.*/
public class Homepage extends Base {
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(css="input[name='first_name']")
		 public WebElement Firstname;
		@FindBy(css="div[class='navbar-collapse paddingleft0']>ul>li:nth-child(1)>a")
		 public  WebElement CustomerLogin;
		@FindBy(css="div[class='navbar-collapse paddingleft0']>ul>li:nth-child(1)>ul>li:nth-child(2)>a")
		  public WebElement CustomerRegister;
		String customerloginText;




		public  Homepage VerifyHomePageandRegister() throws Exception{
			driver.findElement
			(By.cssSelector("div[class='navbar-collapse paddingleft0']>ul>li:nth-child(1)>a")).click();
			MouseHoverAndClick(CustomerLogin,CustomerRegister);
			
			Thread.sleep(2000);
			return PageFactory.initElements(driver, Homepage.class);
		}
		

 





}
