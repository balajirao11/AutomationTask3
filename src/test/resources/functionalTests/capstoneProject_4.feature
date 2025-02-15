Feature: The Internet Application Test
#capStone 4
  Scenario: Verify page title and navigation to A/B Testing
    Given I launch "http://the-internet.herokuapp.com/"
    Then The page title should be "The Internet"
    When I click on "A/B Testing" link
    Then The text on the page should be "A/B Test Variation 1"

  Scenario: Verify dropdown selection
    Given I am on the home page
    When I click on "Dropdown" link
    And I select "Option 1" from dropdown
    Then The selected option should be "Option 1"

  Scenario: Verify hyperlinks on Frames page
    Given I am on the home page
    When I click on "Frames" link
    Then I should see "Nested Frames" link
    And I should see "iFrame" link