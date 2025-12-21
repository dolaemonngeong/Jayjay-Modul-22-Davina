@cart
Feature: Cart
  Background:
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button

  @tes-positif
  Scenario: Add product to cart
    Given user is on homepage
    When user click add to cart button
    Then add to cart button changes to remove button
    And cart icon shows item count
