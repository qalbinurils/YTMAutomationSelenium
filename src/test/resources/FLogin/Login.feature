@Login-Case
  Feature: Test functionality Login page

    @TC-YTM-01-Positive-Login
    Scenario: user login with valid account
      Given user open browser and navigate to login page
        When user input valid email
        And user click button Next
        And user input valid password
        And user click button Login
      Then user navigate to home page and successfully login

      @TC-YTM-02-Negative-Login
      Scenario: user login with invalid password
        Given user open browser and navigate to login page
          When user input valid email
          And user click button Next
          And user input invalid password
          And user click button Login
        Then message failed login appear and user unsuccessfully login