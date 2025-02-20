Feature: Implement below capstone project using Selenium with Java concepts (Implement BDD Framework)

  Scenario Outline: Implement mini project using Gherkin language
    Given I launch the herokuapp web url
    When  I validate the "<page_title>"
    Then  I click on ABTesting link
    And   I validate the page as "<page_name>"
    And   I navigate back to home Page
    And   I selected the "<option>" from the dropdown
    And   I validate the option1 selected
    And   I navigate back to home Page
    And   I scroll down on web page
    And   I validated the text from the frames

    Examples:
      | page_title | page_name            | option  |
      | Welcome    | A/B Test Variation 1 | Option1 |