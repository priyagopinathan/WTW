Feature: search

@search
Scenario: search with valid product name
Given I am in Home Page
When I search for product "test"
Then I should see the search results page
And I Select date sort option
Then I should see results sorted on date