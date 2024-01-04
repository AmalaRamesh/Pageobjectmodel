@login
Feature: To test login webshop functionality
 
  @login
  Scenario: user have to login geeky mart
    Given user should be in login page "https://demowebshop.tricentis.com/"
    When user click login option
    When user have to enter username "mugesh1@gmail.com"
    And user have to enter password "Mugesh@1"
    And user click login submit button
    Then user should be in home page "Logout"