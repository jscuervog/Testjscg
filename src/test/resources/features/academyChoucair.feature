
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario
  Scenario: Search for a automation course
    Given than juan wants to learn automation at the academy Choucair
    | strUser   | strPassword |
    | YourUser   | YourPassword |
    When he search for the course on the Choucair Academy platform
    | strCourse        |
    | Bancolombia Methodology |
    Then he finds the course called

    | strCourse        |
    | Bancolombia Methodology |