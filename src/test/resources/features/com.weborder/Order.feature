Feature: WebOrder Page Food Order

Background:
  Given the user is on weborder home page
  When the user selects "Office" options
  And the user is on the group Order page
  And the user sends invitees note "Test"
  And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"

@regression @smoke
  Scenario: Validation of Food order For Office
## //   Given the user is on weborder home page
#    When the user selects "Office" options
#    And the user is on the group Order page
#    And the user sends invitees note "Test"
#    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
    Then te user validates the "2012 EMPIRE BLVD" adress
    * the user validates "View Group Order" text
    * the user validates total participants is 1
@smoke @regression
  Scenario: Validation of Food order For My House
##    Given the user is on weborder home page
#    When the user selects "Office" options
#    And the user is on the group Order page
#    And the user sends invitees note "Test"
#    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
    And the user selects "My House" options
    Then te user validates the "2112 EMPIRE BLVD" adress
    * the user validates "View Group Order" text
    * the user validates total participants is 1