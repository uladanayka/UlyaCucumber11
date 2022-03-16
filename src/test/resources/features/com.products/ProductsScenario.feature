Feature: Validation of Products

  @productproject
  Scenario: Validation of New Product Creation
    Given the user navigates to product website homepage and click orderButton
    When the user enters the product information "MyMoney" and "4"
    And the user enters the adresss information "Techtorial","2200 E Devon","Chicago","Illinois","60668"
    And the user enters the card information "Visa","6789456788901234","05/25"
    Then the user validates succes message
    And the user validates product details "Techtorial","MyMoney","4","2200 E Devon","Chicago","Illinois","60668","Visa","6789456788901234","05/25"


  @productprojectOutline

  Scenario Outline: Validation of New Product Creation
    Given the user navigates to product website homepage and click orderButton
    When the user enters the product information "<productName>" and "<quantity>"
    And the user enters the adresss information "<customerName>","<street>","<city>","<state>","<zipcode>"
    And the user enters the card information "<cardType>","<cardNumber>","<expirationDate>"
    Then the user validates succes message
    And the user validates product details "<customerName>","<productName>","<quantity>","<street>","<city>","<state>","<zipcode>","<cardType>","<cardNumber>","<expirationDate>"

    Examples:
      | productName | quantity | customerName | street       | city        | state    | zipcode | cardType         | cardNumber       | expirationDate |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon | Chicago     | Illinois | 60668   | Visa             | 6789456788901234 | 05/25          |
      | FamilyAlbum | 6        | ahmet        | 2230 W Devon | Des Plaines | MO       | 60698   | MasterCard       | 678945678890678  | 09/25          |
      | ScrenSaver  | 7        | Dino         | 2200 E Devon | Chicago     | Illinois | 60668   | American Express | 6789456788901234 | 05/25          |