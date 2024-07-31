Feature: Create New Triage Form
  @smoke
  Scenario:Nurse Create ER_Unknown New Triage Form
    Given Nursing Team Open Nursing Module
    And Nursing Team Open The Triage Form
    And Nursing Team Select The Arrival Status
    And Nursing Team Select The Save Button
    And Nursing Team Select Tha Post Button
    Then Nursing Team Close The Triage Form
