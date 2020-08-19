Feature: Validate the GUI test

  @popup-page
  Scenario: 01 - Close popup element
    Given A user navigates to HomePage
    Then popup element is displayed
    And user closed the popup

  @currency-page
  Scenario: 02 - Change currency
    Given A user navigates to HomePage
    And user closed the popup
    And user select the change currency options
    And user change the currency to "US Dollar"
    And user select the change currency options
    And validate the las currency is "USD"

  Scenario: 03 - Validate result
    Given A user navigates to HomePage
    And user closed the popup
    And user select the change currency options
    And user change the currency to "US Dollar"
    And user click on new arrivals options
    And set the filter
    And select Dress
    And click the filter
    And sort by Price Low to High
    Then validate that sum price of result not more than "270" dollar