Feature: Changing The Type Of Unknown From Cash To Insurance
  @smoke
  Scenario: Reception Team Changing The Unknown Type From Cash To insurance
    Given Reception Team Opening The Change Company Screen
    And Reception Team Searching By The Unknown MRN
    And Reception Team Select The Company
    And Reception Team Select The Grade
    And Reception Team Click The Save Button
    And Reception Team Create The Eligibility ByPass
    Then Reception Team close The Front Office Module