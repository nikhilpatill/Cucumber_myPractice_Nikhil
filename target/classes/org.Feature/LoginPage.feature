Feature: Loginpage Feature
  
  @smoke 
  Scenario: verify Login page
    Given user_is_on_login_page
    Then varify_Login_PasswordFiled_ISDisplayed
    And varify_Login_UsernameFiled_ISDisplayed
    And varify_Login_btnFiled_ISDisplayed
    And varify_Login_Title_IsDisplayed "OrangeHRM"
    And varify_Login_Url_IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And varify_Login_Lobo_IsDisplayed
    
    
   @sanity
    Scenario: varify Login Functionality
  Given user_is_on_login_page
  When varify_Login_UsernameFiled_Sendkays "admin"
  And  varify_Login_PasswordFiled_sendKeys "admin123"
  Then varify_Login_Click
   And varify_Login_DhashBoadTxt_IsDisplayed "Dashboard"  
  
   @smoke 
    Scenario: varify Login Tittle
     Given user_is_on_login_page
     And varify_Login_Url_IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
      
   @sanity @smoke 
    Scenario: varify Login Url
     Given user_is_on_login_page
   And varify_Login_Title_IsDisplayed "OrangeHRM"
   
   
   @check 
    Scenario: varify valid_usename and Inavlied password 
     Given user_is_on_login_page
      When varify_Login_UsernameFiled_Sendkays "admin"
     And  varify_Login_PasswordFiled_Invalid "admin1456"
     Then varify_Login_Click
     And varify_Login_Txt_IsDisplayed "Login"
  
  
   
      @check 
    Scenario: varify valid_usename and Inavlied password 
     Given user_is_on_login_page
      When varify_Login_UsernameFiled_Invalid "Nikhil"
     And  varify_Login_PasswordFiled_valid "admin123"
     Then varify_Login_Click
      And varify_Login_Txt_IsDisplayed "Login"
      
  
     @check 
    Scenario: varify valid_usename and Inavlied password 
     Given user_is_on_login_page
      When varify_Login_UsernameFiled_blanked
     And  varify_Login_PasswordFiled_blanked
     Then varify_Login_Click
    And varify_Login_Txt_IsDisplayed "Login"
    
  
    @check
    Scenario: Verify logging into the Application using Keyboard keys (Tab and Enter)
    
     Given user_is_on_login_page
     When varify_Login_UsernameFiled_Sendkays "admin"
     Then varify_tab_kay_
    When  varify_Login_PasswordFiled_sendKeys "admin123"
    Then varify_tab_kay_
   Then varify_Enter_key
    And varify_Login_DhashBoadTxt_IsDisplayed "Dashboard"  
  
  @nikhil
  Scenario: Verify username  and Password text fields in the Login page have the place holder text 
  
    Then : Verify_username_palceholder_isdisplay "Username"
    And : Verify_Pasword_palceholder_isdisplay  "Password"
    
  
