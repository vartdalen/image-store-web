[![ci](https://github.com/vartdalen/image-store-web/workflows/ci/badge.svg)](https://github.com/vartdalen/image-store-web/actions?workflow=ci)

# image-store-web
Java Spring Boot image store web server **application**.

Dockerized.

Exposes a RESTful API on the **device** that is running the **application**.

The purpose of the **application** is to offer a web interface for storing and accessing images on the **device**.

## Useful links

| Description | Link |
| ------:| -----------:|
| SQL database web application: | https://github.com/image-store-org/image-store-sql
| DockerHub: | https://hub.docker.com/repository/docker/imagestoreorg/image-store-web


## Documentation

### Exposed paths

#### Data
```
"/actuator"					//  /health, /info
"/api"						//  /images
"/v3"						//  /api-docs
"/swagger-ui.html"
```

#### Static
```
"/js"
"/css"
"/img"
"/favicon.ico"
```
