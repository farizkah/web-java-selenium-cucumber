Feature: Search hotel

  @Test123
  Scenario: Search hotel by area
    Given guest user visit hotel finder from homepage
    When user search area named "Lembang"
    And user set check in date to "15"th next month
    And user set duration for "3" nights
    And user set guests for "3" child
    And user search the hotels
    Then user see hotel search result in the area