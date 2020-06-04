1. Build [Source](BasicHandler) and get the jar file.
2. Place jar file into the <EI_HOME>/lib directory.
3. Add following handler into the <EI_HOME>/conf/synapse-handlers.xml file.
```xml
<handler name = "BasicHandler" class="org.wso2.sample.synapse.handler.BasicHandler"/>
```
4. Add following log4j property into the <EI_HOME>/conf/log4j.properties file.
```properties
log4j.logger.org.wso2.sample.synapse.handler.BasicHandler=INFO
```
5. Add [synapse proxy](handler_test_proxy.xml) service into the EI server.
6. Envoke the service with curl command or try it tool.
```bash
curl --location --request GET 'http://localhost:8280/services/handler_test_proxy'
```
This will print following logs
```properties
[EI-Core]  INFO - BasicHandler Inside Request Inflow
[EI-Core]  INFO - LogMediator Log = Hit the proxy
[EI-Core]  INFO - BasicHandler Inside Response Outflow
```