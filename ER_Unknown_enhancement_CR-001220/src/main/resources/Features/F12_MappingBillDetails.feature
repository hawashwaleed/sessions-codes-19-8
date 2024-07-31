Feature: Create Mapping Bill Details For ERPatient
  @smoke
  Scenario: Reception Team Create Mapping Bill Details
    Given Reception Team Opening The Order Mapping Screen
    And Reception Team Edit The MRN
    And Reception Team Select The From Visit
    And Reception Team Select The To Visit
    And Reception Team Select The Reason
    And Reception Team Select The Approved By
    Then Reception Team Save Mapping