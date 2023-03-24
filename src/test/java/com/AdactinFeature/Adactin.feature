Feature: Hotel Booking In Adactin Hotel App
Scenario: User Login In To The Web Application
Given user Launches The Web Application
When user Enter Valid Username In Usename Field
And user Enter The Password In Password Field
Then user Clicks Login Button The Page Should Be Navigate To Search Page

Scenario: Search Hotel From Search Hotel Page
When user Select Location From The Location Dropdown
And select Hotel From Hotels Dropdown
And select Roomtype From Room Type Dropdown
And select Number Of Rooms From Number Of Rooms Dropdown
And select Check In Date
And select Check Out Date
And mention Number Of Adult From Adults Per Room Dropdown
And mention Number Of Children From Children Per Room Dropdown
And clicks Search Button
Then it Should Be Navigate To Select Hotel Page

Scenario: Select Hotel From The Select Hotel Page
When select Hotel By Using Radio Button
And clicks Continue
Then it Should Be Navigate To Hotel Booking Page

Scenario: Booking A Hotel
When user Enter The Username In Username Field
And user Enter The Last Name
And user Enter The Billing Address In Address Field
And user Enter The Credit Card Number In Corresponding Field
And user Select The Credit Card Type From Respective Dropdown
And user Select Expiry Date From Respective Dropdown
And user Enter CVV Number
And clicks Book Now Button

And user Click The Logout Button