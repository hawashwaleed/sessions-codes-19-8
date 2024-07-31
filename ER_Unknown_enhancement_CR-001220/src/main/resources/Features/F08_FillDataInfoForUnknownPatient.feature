Feature: Proceed The MRD Team Fill All Data Info For The Unknown Patient
  @smoke
  Scenario: The MRD Team Fill All Data Info For The Unknown Patient
    Given MRD Team Opening The MRD Module
    And MRD Team Opening The Patient Registration Screen
    And MRD Team Searching By MRN
    And MRD Team Edit The Patient Basic Information
    Then MRD Team Close The MRD Module