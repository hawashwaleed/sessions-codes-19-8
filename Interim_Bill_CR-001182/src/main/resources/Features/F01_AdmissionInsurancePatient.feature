Feature: Admitted The Insurance Patient
  @smoke
  Scenario: The Admission Office Team Admitted The Insurance Patient
    Given The Admission Team Opening The Admission Module
    When The Admission Team Searching By MRN
    And The Admission Team Edite The Admission Data
    And The Admission Team Saving The Admission Data
    Then The Admission Team Close The Admission Module
