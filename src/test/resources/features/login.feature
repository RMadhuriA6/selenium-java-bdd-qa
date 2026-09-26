Feature: Login
  Scenario: Login with valid credentials
Given the user is in login page
When the user logs in with valid credentials
Then the user should land on Shop Page

    Scenario Outline: Login with invalid credentials

      Given the user is in login page
      When the user logs in with "<username>" and "<password>"
#      Then the user should see a "<message>" on "<page>"
      Then the user should be on Login page

      Examples:
      | username            | password          |
      | Username-1          | Learning@830$3mK2 |
      | rahulshettyacademy  | Password-1        |
      | Username-2          | Password-2        |
      | Username-3          |                   |
      |                     | Password-3        |
      |                     |                   |