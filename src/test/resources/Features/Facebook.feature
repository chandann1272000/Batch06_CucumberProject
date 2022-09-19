#Author: sunilhiregowda@gmail.com
Feature: Facebook Functionalities

  @Facebook 

  # direct passing arguments
  @TS01
  Scenario: Facebook Login Functionalities
    Given Navigate to Facebook login page
    When Enter Username and Password "Ram ","venilkaj235"
    Then Validate the login Function

  #passing through examples
  @TS02
  Scenario Outline: Facebook Login Functionalities
    Given Navigate to Facebook login page
    When Enter username and password "<Username>","<Password>"
    Then Validate the login Function

    Examples: 
      | Username | Password |
      | Chandan | chadnan234 |

  #data table method
  @TS03
  Scenario: Facebook Login Functionalities
    Given Navigate to Facebook login page
    When Enter username and password
      | Username  | Password |
      | dorababu  |   123456 |
      | babu      |  4566780 |
      | sunilkuma | fanta    |
    Then Validate the login Function
