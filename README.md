# Introduction
This is a very simple SpringBoot application project highlighting how can we work out a Springboot web dependency project all the way to Azure webapp for containers.

## Steps 
1. Downloaded the Springboot skelton from Spring initializer with web dependency, Java 8 & Maven
2. Imported in IDE (Eclipse) and made a simple Rest controller to return text on root request
3. Tested the project locally
4. Build reuseble image using either of below options-
4a. Add & populate the dockerfile to be used to build image
4b. Use maven-webapp plugin to create and push image to private registry
4c. Use maven-jib plugin to create and push image to private registry
4d. Use the dockerfile-maven plugin
5. Build & Test the docker container
6. Create the webapp resources utilizing the custom container image.
7. Aha! We are done, verified !
