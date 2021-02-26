Feature:Iframe
  Scenario: Picking the iframe Date
    Given initialize the browser through chrome
    When Navigate to this "https://jqueryui.com/datepicker/" site
    And select the user required month and from that select the required date
    Then the date is succesfully picked
