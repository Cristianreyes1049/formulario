Feature: Llenar Formulario

  Scenario: LLenar formulario con datos como aparece
    Given I’m on the homepage
    When I type “Cristian” into the first name
    And I type “Reyes” into the last name
    And I select Country “Colombia” in field
    And type in birthday “09-Jun-1989” in field
    And marital put “Single” status
    And gender “Male”
    And education “Post Graduate”
    And reference1 “Camilo” and “Arjona” and email “Colombia@gmail.com”
    And reference2 “Andres” and “Benitez” and email “Colombia2@gmail.com”
    Then I go to the Apply
    When I click on the Apply
    Then check out form successful