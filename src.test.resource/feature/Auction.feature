Feature: OnlineBidding UAT feature

Background: Given I want to launch the "<browser>" browser

Scenario Outline: Seller should log in with valid credentials
    
    And Open AuctionOnline App
    And Enter "<username>" and "<password>"
    And click on Submit Button    
    #Then Item Page should be loaded
  
Examples: 
    |username  |password |browser|
    |Ani  		 |Ani 		 |Chrome|
	  

 
