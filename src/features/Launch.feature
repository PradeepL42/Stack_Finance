Feature: sign up
  @Test
  Scenario: Sign into the app

    Given I open the app
    Then I choose layout
    Then I wait for the screen to load
    When I search the items "coffee"
    Then I add item to the list
    When I search the items "tea"
    Then I add item to the list
    Then I delete items from the list





