# Split-Dine App

Before Running:

1. Check if you have all the dependencies. If not, redownload all from gradle.

2. Run these sql scripts (in this order):
  i) split_dine_create.sql - this creates our tables 
  ii) insert_split_dine.sql - this fills our tables
  
3. Your project should run.

If you are using Intellij Idea, you can see a list of endpoints under endpoint tab in the lower ribbon (where Run, Problems, Terminal etc. exists)

4. Once you have the endpoints - head over to Postman or your REST Service tester of choice (cUrl for example) and test it as:
GET    http://localhost:8080/dishes -- an example

## Some key Endpoints

GET /dishes - lists all dishes 

GET /dishes/{dishId} - lists dishes by their dish_id

GET /orders - lists all orders
