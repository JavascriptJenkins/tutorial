# tutorial

### Use the route below to get static json payload of person objects
##### http://localhost:8080/api/person/all

    ## This project is using h2 database 
    ## The database will be filled at startup with data from data.sql
    ## spring.datasource.url defines the flatfile used to store our database data
    ## this url will provide a ui for the database --> http://localhost:8080/h2-console
    spring.datasource.username=sa
    spring.datasource.password=password

    