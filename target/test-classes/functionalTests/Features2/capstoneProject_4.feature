Feature: The Internet Application Test
#capStone 4

  @capStone41
  Scenario Outline: As a new customer, Create an account and place order from T-shirts
    Given I launch the web url
    When  I validated the "<page_title>"

    Examples:
      | email address | page_title   | first name | sur name | password | address | city      | state | zip   | country       | mobile phone | address alias |
      |               | The Internet | Page_title | lastxa   | Pawd1    | x1 lane | salt lake | Ohio  | 84044 | United States | 9834398090   | X1list        |
