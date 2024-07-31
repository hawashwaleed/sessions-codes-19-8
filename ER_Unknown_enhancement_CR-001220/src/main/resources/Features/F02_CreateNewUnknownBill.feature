Feature: Create The New Consultation
  @smoke
  Scenario: Reception Team Create The New Bill For the Unknown Patient
    Given user search by the screen Out Patient Charging name
    And User Open The Out Patient Charging screen
    And user edit the MRN
    And user click the Proceed to Billing button
    And user select the doctor
    And user click on proceed button
    And user select the billing tap
    And user click the PREPARE BILL button
    And user click the cash charge icon
    And user click the Ok alert message
    Then user make sure the system generated Number of bill and close FO



