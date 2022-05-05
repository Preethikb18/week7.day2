
Feature: Functionality of Create Lead
@Sanity
Scenario: Creating lead with positive credintials

#Given Open the browser
#Given Load the url


When Enter the username_name as 'DemoSalesManager'
When Enter the password_pass as 'crmsfa'
When Clicking  the login button
When Clicking the CRMSFA link
When Clicking the Leads link
When Clicking  the create lead link
When Enter the company name
When Enter the first name
When Enter the last name
When Clicking the Create lead button
Then View Lead page should be displayed
