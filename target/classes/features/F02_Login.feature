
@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  Given user go to login page
  When user login with valid email and password
  And user press on login button
  Then user login to the system successfully
@smoke
  Scenario: user could login with invalid email and password
 Given user go to login page
  When login_with_invalid_email_and_Password
  And user press on login button
  Then user could not login to the system


#wrong@example
#P@ssw0rd