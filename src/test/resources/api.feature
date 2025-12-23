@api
Feature: Automation REST API TheMealDB

  @tes-positive
  Scenario: Get all meal categories
    Given user sends GET request to get categories
    Then response status code should be 200
    And response body should match json schema "getAllMealsCategories.json"

  @tes-positive
  Scenario: Search a meal with a valid name
    Given user sends GET request to get a meal named "Arrabiata"
    Then response status code should be 200
    And response body should match json schema "searchMeal.json"

  @tes-negative
  Scenario: Search a meal with an invalid name
    Given user sends GET request to get a meal named "xxxxx"
    Then response status code should be 200
    And response body should contain empty meals list

