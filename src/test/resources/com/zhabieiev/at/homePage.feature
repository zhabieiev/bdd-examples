Feature: Home page for web app

  @excluded
  Background:
    Given I browse to the web app and I am not logged in
    When I login with a valid user
    Then I see a "home" page

  @excluded
  Scenario: I am logged in and see a menu bar
    When I see a menu bar
    Then the menu bar has options
      | Home      |
      | Profile   |
      | Dashboard |
