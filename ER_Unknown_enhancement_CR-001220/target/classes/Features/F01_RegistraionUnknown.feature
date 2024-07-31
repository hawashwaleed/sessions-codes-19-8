Feature:Create New file For ER Unknown Patient
@smoke
  Scenario:  Reception Team Create The New File From Front Office
    Given user login  user name
    When user edit valid password
    And user click login button
    And user from home page search for front office module
    And user select the front office module
    And user edit the station name
    And user search the station name
    And the user select the station
    And the user click the set station button
    And the user click the success message
    And the user searching by the screen Registration name
    And user select Registration screen
    And user click the registration unknown patient button
    And user edit the mandatory field First Name
    And user edit the mandatory field the Family Name
    And user click the Save and Generate MRN button
    And user click the OK button
    Then user click the close button for new MRN unknown number


