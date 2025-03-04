Feature: Implement below capstone project using Selenium with Java concepts (Implement BDD Framework)

  Scenario Outline: Implement mini project using Gherkin language
    Given I launch the amazon website
    When  I select the search box

    Examples:
      | page_title | page_name            | option  |
      | Welcome    | A/B Test Variation 1 | Option1 |