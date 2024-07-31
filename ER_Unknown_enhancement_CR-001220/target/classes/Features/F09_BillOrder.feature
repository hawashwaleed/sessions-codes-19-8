Feature: Create The Bill Doctor Order
  @smoke
  Scenario: Reception Team Create The Bill Doctor Order
    Given Reception Team Opening The Out Patient Charging Screen
    And Reception Team Searching By MRN
    And Reception Team Select The Doctor Request Tab
    And Reception Team Select The Doctor Lab Items And Generated Bill
    And Reception Team Refreshing The Out Patient Charging Screen
    And Reception Team Searching By The Same MRN for Discharge The XRay Items
    Then Reception Team close The Front Office Module
