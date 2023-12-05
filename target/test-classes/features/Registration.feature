Feature: As a student I want to register successfully

  @test
  Scenario: valid Registration
    Given I navigate to the website
    And I click sign up button
    And  i enter the username
    And I enter the email
    And i enter Password
    And I enter confirm Password
    And I click register instructor
    And I enter degree
    And I enter expertize
    And I click on register button
    Then Enrolled courses displayed