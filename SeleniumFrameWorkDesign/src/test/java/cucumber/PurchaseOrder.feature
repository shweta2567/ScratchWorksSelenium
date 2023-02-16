
@tag
Feature: Purchase order from Ecommerce Website
  I want to use this template for my feature file

Background:
Given I landed on Ecommerce Page
 @tag2
  Scenario Outline: Positive test of submitting order
    Given Logged in with username "<username>" and password "<password>"
    When I add product "<productName>" to Cart
    And Checkout "<productName>" and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on confirmation page

    Examples: 
      | username            | password   | productName |
      |shweta@gmail.com     | Shweta@123 | ZARA COAT 3 |
      
