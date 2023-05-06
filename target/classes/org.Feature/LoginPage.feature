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
  
  
   @smoke 
    Scenario: varify Login Tittle
     Given user_is_on_login_page
      And varify_Login_Title "OrangeHRM"
      
   @sanity @smoke 
    Scenario: varify Login Url
     Given user_is_on_login_page
      And varify_Login_Url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   
  
  
  
    
    
  
