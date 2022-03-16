Feature:

  Scenario: Register a patient
    Given the user in to OpenMRS with following credentials
      | username | admin    |
      | password | Admin123 |
    When the user registers a new patient with following information:
      | GivenName    | Diana        |
      | FamilyName   | Kanat        |
      | Gender       | Female       |
      | Day          | 3            |
      | Month        | April        |
      | Year         | 2000         |
      | Adress       | 2200 E Devon |
      | PhoneNumber  | 12345697     |
      | RelationType | Doctor       |
      | RelativeName | Potel        |
    Then the user valiadtes the patient name and familyName
      | GivenName  | uldanay |
      | FamilyName | Adiya   |