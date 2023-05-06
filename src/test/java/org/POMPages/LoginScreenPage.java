
package org.POMPages;

import java.util.List;

import org.BaseUtility.startUp;
import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.propertiesUtility.PropertiesGeneric;
import org.testng.Reporter;

public class LoginScreenPage {
	
	public static  WebDriver driver;
	//webElemets 
	@FindBy(xpath="//input[@name=\"username\"]")
     private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password ;
	
	
 	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement submit ;
	
	@FindBy(xpath="//img[@alt=\"orangehrm-logo\"]")
	private List<WebElement> lobo ;


	
	//Contructor  
	
	public LoginScreenPage(WebDriver driver)
	
	{
		  this.driver=driver;
		  
		  PageFactory.initElements(driver,this);
	}
	

	
	
	//action methods ()
 	
 	public String varify_Login_Title()
 	{ return  driver.getTitle();
 		
 	}
 	
	
 	public String varify_Login_Url()
 	{
 		return driver.getCurrentUrl();
 		
 	}
 	
	
 	public boolean varify_Login_UsernameFiled_ISDisplayed()
 	{
 		return username.isDisplayed();
 	}
 	
 	public void varify_Login_UsernameFiled_Sendkays(String value)
 	{
 		 username.sendKeys(value);
		
 		
 	}
	
	
 	public boolean varify_Login_PasswordFiled_ISDisplayed()
 	{

 		return  password.isDisplayed();  
 		
 		
 	}
 	
	
 	public void varify_Login_PasswordFiled_sendKeys(String value)
 	{
      
          password.sendKeys(value);
 	
 	}
	



	public boolean varify_Login_btnFiled_ISDisplayed()
 	{
	      return submit.isDisplayed();   
 	}
	
	

	public void varify_Login_Click()
 	{
 		
		    submit.click();
		
 	}
	
	public boolean varify_Login_lobo()
 	{
 		for(int i=0;i<2;i++)
 		{
 			if(!lobo.get(i).isDisplayed())
 			{
 				return false;
 				
 			}
 			
 		}
 		
 		return true ;
		 
		
 	}
 	
 
}
