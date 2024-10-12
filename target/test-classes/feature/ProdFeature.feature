Feature: Products API

Scenario: Add Product
Given I set POST Product Service API Endpoint
When I set request Header
And Send a POST HTTP request
Then I receive a valid response 201

Scenario: Update Product
Given I set PUT Product Service API Endpoint
When I set update request Body
And Send a update HTTP request
Then I receive a valid response 200


Scenario: Delete Product
Given I set DELETE Product Service API Endpoint
When I set Delete HTTP request
And I Send a DELETE HTTP request
Then I receive a valid response 200

Scenario: Get Product Info
Given I set GET Product Service API Endpoint
When I set request Header
And Send a GET HTTP request
Then I receive a valid response 200
