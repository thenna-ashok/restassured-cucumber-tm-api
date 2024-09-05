@categoryAPI
Feature: To retrieve a category and validate the category details

  @searchCategory
  Scenario: To validate category details
    Given user makes a request to view details of a category
    When user get the response code 200
    Then user validates the response with JSON schema "categoryDetail"
    And user should see all the below category details
      | CategoryName   | CanRelist | PromotionName | PromotionDesc             |
      | Carbon credits | true      | Gallery       | Good position in category |