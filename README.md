#Overview
Project for automatic running of selenide UI tests for zenoo-platform-based applications

#Initial installation:

## Install curl (if not yet installed):

```
sudo apt-get -y install  curl
```

## Install docker

```
sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -    
sudo apt-key fingerprint 0EBFCD88
sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"
sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io
```

## Install docker-compose

```
sudo curl -L https://github.com/docker/compose/releases/download/1.21.2/docker-compose-`uname -s`-`uname -m` -o /usr/bin/docker-compose
sudo chmod +x /usr/bin/docker-compose

```

## Check docker compose

```
docker-compose --version
```

If ok - version of docker-compose should appear in console

# Every day usage

Run following commands in project's root folder

## Login into Gitlab docker registry (with your Gitlab login/password)
```
docker login registry.gitlab.com
```
## Run docker-compose

```
docker-compose up -d
``` 
## Run tests
```
mvn clean test
```

## Run tests and generate report for allure
```
 mvn clean test && mvn allure:serve
```

## Run tests by tag and generate report for allure
```
 mvn clean test -Dtag=tag && mvn allure:serve
```

## Run tests by tag in headless mode and generate report for allure
```
 mvn clean test -Dselenide.headless=true -Dtag=tag && mvn allure:serve
```

## Stop and remove running containers
```
docker-compose down
```

## Pull latest version of artifacts from repository
```
docker-compose pull
```