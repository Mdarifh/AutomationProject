Feature: Application Login

Scenario: Login With Valid credentials
Given Open Any Browser
And Navigate to Login Page
When User enter username as "mdimranzama3110@gmail.com" and password as "Huss@1narif" into the feilds
And User Click on login button
Then Verify user is able to Successfully Login