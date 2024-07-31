Feature: Proceeding The Unknown Patient Dispensing The Medication Items
  @smoke
  Scenario: The Unknown Patient Conducting The Medication Items
    Given The Pharma Doctor Opening The MMS Module
    And The Pharma Doctor Select OPEmergency Station
    And The Pharma Doctor Opining ER Screen
    And The Pharma Doctor Opining Detail Screen
    And The pharma Doctor Dispensing Order
    And The Pharma Doctor Dispensing One Item
    And The Pharma Doctor Bill The PARTIAL DISPENSE Item
    And The Pharma Doctor Bill The PARTIAL DISPENSE Item2
    Then The Pharma Doctor Close The MMS Module
