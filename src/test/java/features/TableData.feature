Feature:Html table Data
  Scenario: Printing table data
    Given Initialize the browser with chrome
    When Navigate to "https://www.w3schools.com/html/html_tables.asp" site
    And Get the row count ,columcount and table data
    Then Table printed succesfully
