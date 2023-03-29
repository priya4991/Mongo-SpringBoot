# Mongo-SpringBoot

Pull mongo image -
`docker pull mongo`
If latest image doesnt work on your machine, pull a specific version like
`docker pull mongo:4.0.4`

Run the downloaded image using - 
`docker run -d --name mongo-on-docker -p 27017:27017 mongo`
(or mongo:[version number])

To run locally, change to `spring.data.mongodb.host=localhost` 

## To use docker-compose to deploy the project - 

1) change to `spring.data.mongodb.host=mongodb`  (container name)
2) build the project with `./mvnw clean install -DskipTests`
3) build image - `docker build -t <image name> .`
4) make sure to stop and delete mongo:4.0.4 container -
`docker ps -a`  find mongo docker container. 
Stop it using `docker stop <container number>`
Remove it using `docker rm <container number>`
5) `docker-compose up`