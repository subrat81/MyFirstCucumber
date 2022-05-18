Feature: LogIn Functionality Feature
@LoginTest
Scenario:
Validate LogIn test
Given navigates to Orangehrm
When user logs in using username as "Admin"
And password logs in using password as "Qedge123!@#"
When user click LogIn button
Then user should validate url text
Then user close browser
@UserMultipleData
Scenario Outline:
Validate User with multiple data
Given provide url to the browser
When I enter username as "Admin"
And enter password as "Qedge123!@#"
When I click Login button
When I click Admin 
When I click add btn
When I selsect "<UserRole>" in userrole
When I enter "<EmployeeName>" in ename
When I enter "<UserName>" in uname
When I enter "<password>" in password
When I enter "<cpassword>" in cpassword
When I click save btn
Then I validate url
Then close the browser
Examples:
|UserRole | EmployeeName|UserName|password|cpassword|
|ESS|amol ghadge|Sachin tendulkar|asedfS1@34567|asedfS1@34567|
|Admin|fname lname|Vinod kambli|hgfdA564#27|hgfdA564#27|
|ESS|Anusha demo|V Kohli|asdFgh@345|asdFgh@345|
|Admin|Deena soni|R sharma|zaqW@3456|zaqW@3456|
@EmployeeMultipleData
Scenario Outline:
Varify Employee with multiple data
Given run url to the browser
When Enter username as "Admin"
And password as "Qedge123!@#"
When Click login button
When Click on Pim
When Click on add btn
When I give "<FirstName>" in fname
When I give "<MiddleName>" in mname
When  I give "<LastName>" in lname
When Click on save btn
Then Validate url
Then close browser
Examples:
|FirstName|MiddleName|LastName|
|Prakash|Chandra|Mohanty|
|Suresh|Kummar|Rout|
|Virat|Chandra|Kohli|
|Rohit|Kumar|Sharma|
@ValidateBranch
Scenario Outline:
Varify Primus user with multiple data
Given run primus url to the browser
When Enter username as "Admin"
And the password as "Admin"
When Click login button
When Click the branches
When click the new branch
When I enter "<BranchName>" in bname
When I enter "<Adress1>" in adr1
When I enter "<Adress2>" in adr2
When I enter "<Adress3>" in adr3
When I enter "<Area>" in area
When I enter "<Zipcode>" in zcode
When i select "<Country>" in country
When i select "<State>" in state
When i select "<City>" in city
When i click save btn
Then validate alert massage
Then close the browser
Examples:
|BranchName|Adress1|Adress2|Adress3|Area|Zipcode|Country|State|City|
|kukatpalli|mahanga|cuttack|salepur|chahapada|23456|INDIA|Delhi|Delhi|
|mahendra|ratnagada|lalitgiri|balechandrapur|salepur|45678|INDIA|Delhi|Delhi|
|sachin|tendulkar|ramesh|subrat|mahanga|32145|INDIA|GOA|GOA|



