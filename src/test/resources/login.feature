@login
Feature: Login

  @tes-positif
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user should be redirected to homepage

  @tes-negatif
  Scenario: Login using invalid username and password
    Given user is on login page
    And user input username with "std"
    And user input password with "secretsauce"
    When user click login button
    Then user see error message "Epic sadface: Username and password do not match any user in this service"

  @tes-batas
  Scenario: Login using empty username and password
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user see error message "Epic sadface: Username is required"