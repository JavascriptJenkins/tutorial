# tutorial

### Use the route below to get static json payload of person objects
##### http://localhost:8080/api/person/all

    ## This project is using h2 database 
    ## The database will be filled at startup with data from data.sql
    ## spring.datasource.url defines the flatfile used to store our database data
    ## this url will provide a ui for the database -->
    http://localhost:8080/api/h2-console
    user name is: sa
    password is: password
    connection string is: jdbc:h2:file:./data/demo

    spring.datasource.username=sa
    spring.datasource.password=password

## Serving images
     images will be served like this:
     http://localhost:8080/api/tree-736885__480.jpeg

    http://3.21.225.172:8080/api/person/all
    http://3.21.225.172:8080/api/realestate/getByRowAmount?rows=10
    http://3.21.225.172:8080/api/realestate/all
    http://3.21.225.172:8080/api/tree-736885__480.jpeg
    http://3.21.225.172:8080/api/h2-console

    

## To deploy
    ssh -i /Users/genreboy/Downloads/LightsailDefaultKey-us-east-2.pem ubuntu@3.21.225.172
    sudo killall java -9
    sudo lsof -i :8080
    scp -i /Users/genreboy/Downloads/LightsailDefaultKey-us-east-2.pem /Users/genreboy/IdeaProjects/tutorial/target/tutorialapp-0.0.1-SNAPSHOT.jar ubuntu@3.21.225.172:tutorialjava/
    sudo nohup java -jar tutorialapp-0.0.1-SNAPSHOT.jar &