Feature: Create The Interim Bill For The Insurance Patient
  @smoke
  Scenario: The Admission Office Team Create The Interim Bill
    Given The Admission Office Team Open The IPBilling Module
    And The Admission Office Team Opening The InPaten Bill Screen
    And The Admission Office Team Searching MRN
    And The Admission Office Team Create The Interim Bill
