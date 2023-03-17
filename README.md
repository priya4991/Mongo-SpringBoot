# Mongo-SpringBoot

Pull mongo image -
`docker pull mongo`
If latest image doesnt work on your machine, pull a specific version like
`docker pull mongo:4.0.4`

Run the downloaded image using - 
`docker run -d --name mongo-on-docker -p 27017:27017 mongo`
(or mongo:[version number])

docker-compose is not used in this project.