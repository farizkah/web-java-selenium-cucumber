Feature: Search hotel

  Scenario: Search hotel by area
    Given guest user visit hotel finder from homepage
    When user search area named "lembang"
    And user set check in date to "28"th next month
#    And user set duration for 3 night
#    And user set guests for 3 adults and 2 child
#    And user search the hotels
#    Then user see hotel search result in the area