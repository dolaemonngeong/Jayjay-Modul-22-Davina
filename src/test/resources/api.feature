@api
Feature: Automation REST API TheMealDB

  Scenario: Get all meal categories
    Given prepare TheMealDB API
    When user sends GET request to get categories
    Then response status code should be 200
    And response body should match json schema "getAllMealsCategories.json"
