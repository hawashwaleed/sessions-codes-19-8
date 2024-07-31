Feature: Proceeding The Unknown Patient Conducting XRay
  @smoke
  Scenario: The Unknown Patient Conducting the XRay
    Given Doctor XRay Open The Radiology Module
    And Doctor XRay Open The Order Screen
    And Doctor XRay Searching By The MRN
    And Doctor XRay Select The MRN
    Then Doctor XRay Close The Screen


