Feature: End to end scenarios for placing orders

 @Order @one
 Scenario: verify whether user is able to place an order
     Given I launch the application
      When I add any produt in bad and checkout
      And I place the order
     Then I should see that the order is placed successfully