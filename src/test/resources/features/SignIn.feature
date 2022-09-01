Feature: SignIn Feature as a registered user

  @twl @SignIn
  Scenario: Registered user sees the dashboard

    Given I login as a registered user
    Then I can see the accounts page

  @nlg
  Scenario: Noel Leeming login

    Given I login as a registered user on Noel Leeming
