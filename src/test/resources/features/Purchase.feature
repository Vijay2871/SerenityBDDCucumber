Feature: Purchase a product via MasterVisa Card

  Rule: TWL product only
  @twl
  Scenario: Purchasing a product end-to-end functional testing

    Given I login as a registered user
    When I added a product to cart
    Then I order the product by delivery
