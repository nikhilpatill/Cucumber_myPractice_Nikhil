

package org.StepDefination;

import org.BaseUtility.startUp;
import org.POMPages.LoginScreenPage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSceenStepDef {
	
	private WebDriver driver ;
	private  startUp  sb;
    private LoginScreenPage lp;
    private SoftAssert ac;
	
	@Given("user_is_on_login_page")
	public void user_is_on_login_page() {
		sb=new startUp ();
		driver=sb.startUp("ch", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	}

	@Then("varify_Login_PasswordFiled_ISDisplayed")
	public void varify_login_password_filed_is_displayed() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertTrue(lp.varify_Login_PasswordFiled_ISDisplayed());
	    ac.assertAll();
	  
	}

	@Then("varify_Login_UsernameFiled_ISDisplayed")
	public void varify_login_username_filed_is_displayed() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertAll();
	 
	}

	@Then("varify_Login_btnFiled_ISDisplayed")
	public void varify_login_btn_filed_is_displayed() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertTrue(lp.varify_Login_btnFiled_ISDisplayed());
	    ac.assertAll();
		
	}
	
	@Then("varify_Login_Title_IsDisplayed {string}")
	public void varify_login_title_is_displayed(String Expected) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_Title(), Expected);
	}

	@Then("varify_Login_Url_IsDisplayed {string}")
	public void varify_login_url_is_displayed(String Expected) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_Url(), Expected);
		
	}
	
	@Then("varify_Login_Lobo_IsDisplayed")
	public void varify_login_lobo_is_displayed() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertTrue(lp.varify_Login_lobo());
	   
	}

	@When("varify_Login_UsernameFiled_Sendkays {string}")
	public void varify_login_username_filed_sendkays(String value) {
	  
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_UsernameFiled_Sendkays(value);
		
	}

	@When("varify_Login_PasswordFiled_sendKeys {string}")
	public void varify_login_password_filed_send_keys(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_PasswordFiled_sendKeys(value);
	}

	@Then("varify_Login_Click")
	public void varify_login_click() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_Click();
	}



	
	

	
	
	

}
