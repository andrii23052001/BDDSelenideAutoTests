Feature: login on user's page

  Scenario: user can be successfully authorize with valid data

    Given user is opening the login page
    When user authorizes with: email 'aqaandriikovalstudentt@gmail.com' password 'qwerty12'
    Then user sees the button 'Edit account'

  Scenario: user can not be successfully authorize with invalid data
    Given user is opening the login page
    When user authorizes with: email 'Rakandriikovalstudentt@gmail.com' password 'qwerty12'
    Then user sees the notification about incorrect credentials
