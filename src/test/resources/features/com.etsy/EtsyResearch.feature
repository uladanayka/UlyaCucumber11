Feature: Etsy Search Functionality

  Background: navigate
    Given the user navigates to "https://www.etsy.com/"

  @hat @tc1 @smoke @regression
  Scenario: Validation of etsy search Hat
    When hhe user searches with "Hat"
    Then the user validates the title "Hat | Etsy"

  @key @tc2 @smoke @regression
  Scenario: Validation of etsy search Key
    When hhe user searches with "Key"
    Then the user validates the title "Key | Etsy"

  @pin @tc3 @smoke
  Scenario: Validation of etsy search Pin
    When hhe user searches with "Pin"
    Then the user validates the title "Pin | Etsy"