Feature: Login functionality scenario

    @Login @one
    Scenario: verify  Whether the user is able to login with valid credentials
    Given I launch the Application
    And I navigate to Account login page
    When I login to the Application using "Girish@gmail.com" and enter password "Sonu@123"
    And I should see user is able to login successfully
    
    @Login @two
    Scenario: verify  Whether the user is not able to login with invalid credentials
      Given I launch the Application
      And I navigate to Account login page
      When I login to the Application using "Girish@gmail.com" and enter password "Sonu@12344"
      And I should see error messege that credentials are invalid
    
    @Login @Three  
   Scenario: verify  Whether the user is not able to login with invalid credentials
      Given I launch the Application
      And I navigate to Account login page
      When I login to the Application using "" and enter password " "
      And I should see error messege that credentials are invalid
      
     @Login @four
    Scenario: verify  Whether the user is able verify the forgotten password
      Given I launch the Application
      And I navigate to Account login page
      When I  reset the forgotten password for email"Girish@gmail.com"
      And I should see messege informing user that information related to setting passwrd have been sent to email
      
      
      
      
      
    
      
    
    
  
