
Feature: Validate Signup functionality to ParaBank
 

  @Regression
Scenario: Validate Signup functionality to ParaBank
    Given user clicks Register link from HomePage
 
   When user enter the FirstName, LastName with Header and getting the data using Class objects
    | FirstName   | LastName | Address    | City    | State      | Zipcode | PhoneNo    | SSN | UserName   | Password | Confirm |
    | jeyas | A V      | 1st street | Madurai | Tamil Nadu | 12345   | 9876543120 | 345 | suryaa1     | 123      | 123     |
    | jeyasu | A V      | 1st street | Madurai | Tamil Nadu | 12345   | 9876543120 | 345 | suryaa2 | 123      | 123     |
     
  
     And click on Register Button
    Then message "Your account was created successfully. You are now logged in." should be displayed in Welcome Page

	
