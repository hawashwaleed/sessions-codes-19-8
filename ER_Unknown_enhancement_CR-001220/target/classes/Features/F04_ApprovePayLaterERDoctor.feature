Feature: Pay Later ER Doctor Approval
  @smoke
  Scenario: ER Doctor will Approve Pay later
    Given ER Doctor login With Valid Privilege
    And ER Doctor Select The Unknown Patient From Pay Later Tab
    And ER Doctor click Approval Button
    And ER Doctor Select The Visit
    And ER Doctor Edit the Descriptions In The Visit
    Then ER Doctor Close The Visit
