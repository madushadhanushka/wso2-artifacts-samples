1. Compile the [Class-Mediator](Class-Mediator) project with the "mvn clean install".
2. Upload built jar file or prebuilt [custom-mediator-1.0-SNAPSHOT.jar](custom-mediator-1.0-SNAPSHOT.jar) into the <EI_HOME>/lib directory.
3. Add [simple_class_proxy.xml](simple_class_proxy.xml) into the proxy services.
4. Evoke the service with
<br>`curl -H 'Accept: application/json' -X GET https://localhost:8243/services/simple_class_proxy -k`
This will print "hello = Hello world" in carbon logs.

<i>In case of SSL error while using curl, use -k option with curl command</i>