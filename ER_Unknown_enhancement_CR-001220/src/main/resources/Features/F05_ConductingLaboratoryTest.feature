Feature: Proceeding The Unknown Patient Conducting The Laboratory Testes
@smoke
  Scenario: Unknown Patient Conducting The Laboratory Testes
    Given Doctor Lab Open The Laboratory Module
    And Doctor Lab Open The Test Requisition Screen
    And Doctor Lab Searching By Unknown MRN patient
    And Doctor lab Select The Unknown MRN
    And Doctor Lab Make Result Confirmed
    And Doctor Lab Make Result Validated
    Then Doctor Lab Close The Laboratory Module
