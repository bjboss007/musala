## Drone Dispatcher Application
This application is used to manage fleet of drones.


### Introduction
There is a major new technology that is destined to be a disruptive force in the field of transportation: **the drone**. Just as the mobile phone allowed developing countries to leapfrog older technologies for personal communication, the drone has the potential to leapfrog traditional transportation infrastructure.

Useful drone functions include delivery of small items that are (urgently) needed in locations with difficult access.



### Running the Application

#### Dependencies
- [Docker](https://docs.docker.com/desktop/)

The application is containerized using docker. This section explains the steps to run the application smoothly after download.

#### Getting Started
- Install and setup docker
- Open terminal and run the following commands
  ```
  $ git clone https://github.com/bjboss007/musala.git
  $ cd drone
  $ docker-compose build app
  $ docker-compose up -d

Once the application is up, you can proceed to the Swagger documentation to test out the endpoints.
[here](http:localhost:9095/swagger-ui.html)

