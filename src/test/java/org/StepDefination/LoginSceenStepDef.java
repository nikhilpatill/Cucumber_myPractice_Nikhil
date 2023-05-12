

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
	    ac.assertAll();
	}
	
	@Then("varify_Login_Title_IsDisplayed {string}")
	public void varify_login_title_is_displayed(String Expected) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertTrue(lp.varify_Login_Title().equals(Expected));
	    ac.assertAll();
	}

	@Then("varify_Login_Url_IsDisplayed {string}")
	public void varify_login_url_is_displayed(String Expected) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_Url(), Expected);
	    ac.assertAll();
	}
	
	@Then("varify_Login_Lobo_IsDisplayed")
	public void varify_login_lobo_is_displayed() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertTrue(lp.varify_Login_lobo());
	    ac.assertAll();
	   
	}

	@When("varify_Login_UsernameFiled_Sendkays {string}")
	public void varify_login_username_filed_sendkays(String value) {
	  
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_UsernameFiled_Sendkays(value);
	    ac.assertAll();
		
	}

	@When("varify_Login_PasswordFiled_sendKeys {string}")
	public void varify_login_password_filed_send_keys(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_PasswordFiled_sendKeys(value);
	    ac.assertAll();
	}

	@Then("varify_Login_Click")
	public void varify_login_click() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_Click();
	    ac.assertAll();
	}

	@When("varify_Login_UsernameFiled_blanked")
	public void varify_login_username_filed_blanked() {
	   
		
	}
	@When("varify_Login_PasswordFiled_blanked")
	public void varify_login_password_filed_blanked() {
	   
	}

	@When("varify_Login_UsernameFiled_Invalid {string}")
	public void varify_login_username_filed_invalid(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_UsernameFiled_Sendkays(value);
	    ac.assertAll();
		
	}
	@When("varify_Login_PasswordFiled_valid {string}")
	public void varify_login_password_filed_valid(String string) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_PasswordFiled_sendKeys(string);
	    ac.assertAll();
	}
	
	@When("varify_Login_PasswordFiled_Invalid {string}")
	public void varify_login_password_filed_invalid(String string) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Login_PasswordFiled_sendKeys(string);
	    ac.assertAll();
	}
	@Then("varify_Login_DhashBoadTxt_IsDisplayed {string}")
	public void varify_Login_DhashBoadTxt_IsDisplayed(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_DhashBoadTxt_(),value );  
	    ac.assertAll();
	}

	@Then("varify_Login_Txt_IsDisplayed {string}")
	public void varify_Login_Txt_IsDisplayed(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_LoginTxt_(),value);  
	    ac.assertAll();
	    
	}
	@Then("varify_tab_kay_")
	public void varify_tab_kay() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_tab_Kay();
	  
	}
	@Then("varify_Enter_key")
	public void varify_enter_key() {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    lp.varify_Enter_kay();
	}

	@Then("Verify_username_palceholder_isdisplay {string}")
	public void verify_username_palceholder_isdisplay(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_UsernameFiled_placeholder_ISDisplayed(),value );
	    ac.assertAll();
	  
	}
	@Then("Verify_Pasword_palceholder_isdisplay  {string}")
	public void verify_pasword_palceholder_isdisplay(String value) {
		lp=new LoginScreenPage(driver);
	    ac=new SoftAssert();
	    ac.assertEquals(lp.varify_Login_passwordFiled_placeholder_ISDisplayed(),value);
	    ac.assertAll();
		
	}	    
	

	

	

}
