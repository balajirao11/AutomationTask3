Feature: Register New Customer and place an order from T-shirts tab

  Scenario Outline: As a new customer, Create an account and place order from T-shirts
    Given user is on Signon page
    When user enter "<email address>" and click on create an account button
    When user select title "<title>"
    And user type first name "<first name>"
    And user type sur name "<sur name>"
    And user enter password "<password>"
    And user enter address "<address>"
    And user enter city "<city>"
    And user select the state "<state>"
    And user enter the zip "<zip>"
    And user select the country "<country>"
    And user enter mobile phone "<mobile phone>"
    And user enter address alias "<address alias>"
    When click on Register Button
    Then user logged in and navigate to my account page
    When user clicks on "T-shirts" tab
    When click on Checkout Button
    Examples: 
      | email address | title | first name | sur name | password | address | city      | state | zip   | country       | mobile phone | address alias |
      | tes11@xyz.com | mr    | firstxa    | lastxa   | Pawd1    | x1 lane | salt lake | Ohio  | 84044 | United States |   9834398090 | X1list        |
      
     Scenario Outline: As a new customer, create an account and update first name
    Given user is on Signon page
    When user enter "<email address>" and click on create an account button
    When user select title "<title>"
    And user type first name "<first name>"
    And user type sur name "<sur name>"
    And user enter password "<password>"
    And user enter address "<address>"
    And user enter city "<city>"
    And user select the state "<state>"
    And user enter the zip "<zip>"
    And user select the country "<country>"
    And user enter mobile phone "<mobile phone>"
    And user enter address alias "<address alias>"
    When click on Register Button
    Then user logged in and navigate to my account page
    And user name "<first name>" followed by "<sur name>" displayed in top right corner
    And user can see "My personal information" link in My Account Page
    When user clicks on My personal information link
    And user update first name "testss"
    And user current password "Pawd1"
    Then click on save Button
    And logout from the application

    Examples: 
      | email address | title | first name | sur name | password | address | city      | state | zip   | country       | mobile phone | address alias |
      | tes19@xyz.com | mr    | firstxb    | lastxb   | Pawd1    | x1 lane | salt lake | Ohio  | 84044 | United States |   9834398090 | X1list        |
   

