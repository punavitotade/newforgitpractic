Feature: Registration functionality scenarios

 @Register @One
 Scenario: Verify whether the user is able to register into the application by providing all the fields
   Given I launch the Application
   And I navigate to the registration page
   When I provide the below details
      |Firstname | Girish |
      |Lastname  | Chanda |
      |Email     | Girish@gmail.com|
      |Telephone | 9527296433|
      |Password  | Sonu@123|
     And I select the privacy policy
     And I Click on Continue button
     Then I should see the user account succesfully created   
     
  @Register @two    
 Scenario: Verify whether the user is not allowed to register on skipping the mandatory field
     Given I launch the Application
     And  I navigate to the registration page
     When I Click on Continue button
     Then I should see the user Account should not created
     And I should see the error messages informing user to fill the mandetory fields  
     
  @Register @three   
 Scenario: Verify whether the user is able register into application by opting for Newsletter Subscription
       Given I launch the Application
       And  I navigate to the registration page
       When I provide the below details
      |Firstname | Girish |
      |Lastname  | Chanda |
      |Email     | Girish@gmail.com|
      |Telephone | 9527296433|
      |Password  | Sonu@123|
      And I select the privacy policy
      And I subscribe to Newsletter 
      And I Click on Continue button
      Then I should see the user account succesfully created
      
  @Register @four      
 Scenario: Verify whether the user is restricted from creating duplicate account
       Given I launch the Application
       And  I navigate to the registration page
       When I provide the below duplicate deatils
      |Firstname | Girish |
      |Lastname  | Chanda |
      |Email     | Girish@gmail.com|
      |Telephone | 9527296433|
      |Password  | Sonu@123|
      And I select the privacy policy
      And I subscribe to Newsletter 
      And I Click on Continue button
      Then I should see the user is restricted from creating account













      
              