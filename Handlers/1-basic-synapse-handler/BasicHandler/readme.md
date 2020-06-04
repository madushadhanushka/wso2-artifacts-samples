## Basic handler

##### How to use this handler?
`mvn clean install` to build the project.
Stop the EI server
Put jar file into to the <EI_HOME>/lib
Register new handler with following config.
```xml
<handler name = "BasicHandler" class="org.wso2.sample.synapse.handler.BasicHandler"/>
```
Start the EI server
