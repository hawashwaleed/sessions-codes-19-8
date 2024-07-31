Feature: Create The New Insurance Consultation Bill
  @smoke
  Scenario: Reception Team Creating New Insurance Consultation Bill
    Given Reception Team Searching For the screen Out Patient Charging name
    And Reception Team Open The Out Patient Charging screen
    And User Edit The MRN
    And Reception Team click the Proceed to Billing button
    And Reception Team select the doctor
    And Reception Team click on proceed button
    And Reception Team select the billing tap
    And Reception Team click the PREPARE BILL button
    And Reception Team click the cash charge icon
    And Reception Team click the Ok alert message
    Then Reception Team make sure the system generated Number of bill and close FO