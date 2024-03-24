Feature: search functionality scenarios
   
   @Search @one
   Scenario: Verify whether the user is able to search for product
       Given I launch the Application
        Then I search for the product "Samsung SyncMaster 941BW"
        Then I should see the product in the serach result  
        
      
   @Search @two     
   Scenario: Verify weather the user is informed when product is not available
           Given I launch the Application
           Then I search for the product "Apple iPhone"
           Then I should see page displaying message "There is no product that matches the search criteria."
           