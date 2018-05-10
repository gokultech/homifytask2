# homifytask2
## App for Homify
## To achieve this task toolset chosen as below :
1.Java 8 : Programming language

2.Eclipse IDE JD Oxygen : IDE

3.MySql : Database

4.Spring boot : Web Framework and dependency injection

5.Spring data – Hibernate : Orm support

6.Lomok : For clean entity management

7.Postman: App to make the http requests.

8.Build Tool : Maven

## Get information about projects,owners
http://localhost:8091/api/projects/owners

## Creating a new Project using POST /api/projects API

Accept: application/json
Content-Type: application/json

{
"header" : "Sample",
"title"  :  "Task"
"description" : "homify test for backend rest",
"duration" : "required",
"owner" : "X",
"type"  : "Y"
}

RESPONSE: HTTP 201 (Created)

## Tasks which not attempted

1. Find all professionals for specific type

2. Testing

3. security



