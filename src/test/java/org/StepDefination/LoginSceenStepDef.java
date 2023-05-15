

package org.StepDefination;

import org.BaseUtility.startUp;
import org.POMPages.LoginScreenPage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSceenStepDef {
	
	private WebDriver driver ;
	private  startUp  sb;
    private LoginScreenPage lp;
    private SoftAssert ac;
    
    @Before() //hooks before exicute tech senario
    public void beforehook()
    {
    	sb=new startUp ();
		driver=sb.startUp("ch", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
    	
    }
    
    @After() //hooks after exicute tech senario
    public void afterhook()
    {
     driver.close();	
    	
    }
    
    @BeforeStep()
    public void befor_EachStepe_hook()
    {
    	lp=new LoginScreenPage(driver);
    	  ac=new SoftAssert();
    	
    }
    
    @AfterStep()
    public void After_EachStepe_hook()
    {
    	
    	 ac.assertAll();
    }
	
	
	@Given("user_is_on_login_page")
	public void user_is_on_login_page() {
		
		System.out.println("url hit successfully");
	  
		
	}

	
	@Then("varify Login {string} ISDisplayed")
	public void varify_login_is_displayed(String LoginpageFileds) {
		if(LoginpageFileds.equalsIgnoreCase("PasswordFiled"))
		{
			 ac.assertTrue(lp.varify_Login_PasswordFiled_ISDisplayed());
		}
		
		if(LoginpageFileds.equalsIgnoreCase("UsernameFiled"))
		{
			 ac.assertTrue(lp.varify_Login_UsernameFiled_ISDisplayed());
		}
		
		if(LoginpageFileds.equalsIgnoreCase("btnFiled"))
		{
			 ac.assertTrue(lp.varify_Login_btnFiled_ISDisplayed());
		}
		
	
		
	   
	}

	@Then("varify Login {string} IsDisplayed {string}")
	public void varify_login_is_displayed(String LoginpageFileds, String Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("Title"))
		{
			
			 ac.assertEquals(lp.varify_Login_Title(),Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("Url"))
		{
			
			 ac.assertEquals(lp.varify_Login_Url(),Expectedfiled);
			
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Txt"))
		{
			
			 ac.assertEquals(lp.varify_Login_LoginTxt_(),Expectedfiled);
			
		}
	   
		
	}
	
	@When("varify Login {string} Sendkeys {string}")
	public void varify_login_Sendkeys(String LoginpageFileds, String  Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("UsernameFiled"))
		{
			
			lp.varify_Login_UsernameFiled_Sendkays(Expectedfiled);
		}
		
		if(LoginpageFileds.equalsIgnoreCase("PasswordFiled"))
		{
			
		lp.varify_Login_PasswordFiled_sendKeys(Expectedfiled);
		
		}
		
		
		
		
	}
	
	@Then("varify Login Click")
	public void varify_login_click() {
		 lp.varify_Login_Click();
	}
	
	@Then("varify {string} kay")
	public void varify_kay(String LoginpageFileds) {
	    
		if(LoginpageFileds.equalsIgnoreCase("tab"))
		{
			lp.varify_tab_Kay();
		}
	    
	   if(LoginpageFileds.equalsIgnoreCase("Enter"))
	   {
				lp.varify_Enter_kay();
		}
	  
	   
	   
	   
   }
		
	@Then("Verify {string} palceholder isdisplay {string}")
	public void verify_palceholder_isdisplay(String LoginpageFileds, String Expected) {
		  
				if(LoginpageFileds.equalsIgnoreCase("username"))
				{
					 ac.assertEquals(lp.varify_Login_UsernameFiled_placeholder_ISDisplayed(),Expected);
				}
			    
				  
				if(LoginpageFileds.equalsIgnoreCase("Pasword"))
				{
					 ac.assertEquals(lp.varify_Login_passwordFiled_placeholder_ISDisplayed(),Expected);
				}
			    
	   
	}
	



	@Then("varify  Login DhashBoadTxt IsDisplayed {string}")
	public void varify_login_dhash_boad_txt_is_displayed(String Expectedfiled) {
	    
		 ac.assertEquals(lp.varify_Login_DhashBoadTxt_(),Expectedfiled);
		
	}






	

}
