Feature: Create The Insurance Bill Order After Mapping
  @smoke
  Scenario: Reception Team Create Insurance Bill Order After Mapping
    Given Reception Team Make The UCAF Approval
    And Reception Team Searching For the screen Out Patient Charging
    And Reception Team Edit The MRN For The ER Insurance Patient
    And Reception Team click the Proceed to Billing button
    And Reception Team Select The Doctor Request Tab
    And Reception Team Select The Doctor Lab Items And Generated Bill
    And Reception Team Refreshing The Out Patient Charging Screen
    And Reception Team Edit The Same MRN For Discharge The Xray Item
    Then Reception Team close The Front Office Module