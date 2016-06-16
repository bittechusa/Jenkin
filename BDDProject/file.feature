Feature: login
Scenario Outline: 
	
	Given User Navigate to LogIn Page
	When User enters "<user>" 
	And Users enter "<pass>"
	Then Message displayed Login Successfully
	
	Examples:
	|user|pass|
	|shahid|123|
	|asad|12345|