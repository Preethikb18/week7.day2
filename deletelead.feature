Feature: Functionality to delete lead

Scenario: Delete lead with positive credentials


When Enter the username1 as 'DemoSalesManager'
When Enter the password1 as 'crmsfa'
When Clicking  the login1 button
When Clicking the 'CRM/SFA' link
When Clicking the 'Leads' link
When Clicking the 'Find Leads' link
When Clicking the 'Phone' link
When Enter the phone area code
When Enter the phone number
When Clicking the 'Find Leads' link
When Clicking the lead id link
When Clicking the delete button
Then My lead page is displayed

