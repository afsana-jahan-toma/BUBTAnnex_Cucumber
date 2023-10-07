Feature: Bubtannext student website testing
  Scenario Outline: Login interface testing
    Given BUBT student login interface
    And click the interface
    And Sendkeys of '<studentId>' and '<password>'
    And click the login button
    And open the student information
    And close the notification of remembering password
    And Scroll Down the page
    And Click the academic info
    And Open the academic info
    And Click the summary option
    And Open the summary page
    And Scroll down the summary page
    And Scroll up the summary page
    And click the log out button
    Then finally logout from the website
    Examples:
      |studentId|password|
   |17182103291|01733113095|