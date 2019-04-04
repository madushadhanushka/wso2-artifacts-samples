1. Download ActiveMQ from [Active MQ](http://activemq.apache.org/download.html)
2. Extract ActiveMQ into a directory.
3. Copy following jar file from the <ACTIVEMQ_HOME>/lib to <EI_HOME>/lib directory.
- activemq-broker-5.8.0.jar
- activemq-client-5.8.0.jar
- activemq-kahadb-store-5.8.0.jar  
- geronimo-jms_1.1_spec-1.1.1.jar
- geronimo-j2ee-management_1.1_spec-1.0.1.jar
- geronimo-jta_1.0.1B_spec-1.0.1.jar
- hawtbuf-1.9.jar
- Slf4j-api-1.6.6.jar
- activeio-core-3.1.4.jar (available in the <ACTIVEMQ_HOME>/lib/optional directory)  

4. Uncomment jms revceiver in <EI_HOME>/conf/axis2/axis2.xml
```

<transportReceiver name="jms1" class="org.apache.axis2.transport.jms.JMSListener">
       <parameter name="myTopicConnectionFactory" locked="false">
           <parameter name="java.naming.factory.initial" locked="false">org.apache.activemq.jndi.ActiveMQInitialContextFactory</parameter>
           <parameter name="java.naming.provider.url" locked="false">tcp://localhost:61617</parameter>
           <parameter name="transport.jms.ConnectionFactoryJNDIName" locked="false">TopicConnectionFactory</parameter>
            <parameter name="transport.jms.ConnectionFactoryType" locked="false">topic</parameter>
       </parameter>
  
       <parameter name="myQueueConnectionFactory" locked="false">
           <parameter name="java.naming.factory.initial" locked="false">org.apache.activemq.jndi.ActiveMQInitialContextFactory</parameter>
           <parameter name="java.naming.provider.url" locked="false">tcp://localhost:61617</parameter>
           <parameter name="transport.jms.ConnectionFactoryJNDIName" locked="false">QueueConnectionFactory</parameter>
            <parameter name="transport.jms.ConnectionFactoryType" locked="false">queue</parameter>
       </parameter>
  
       <parameter name="default" locked="false">
           <parameter name="java.naming.factory.initial" locked="false">org.apache.activemq.jndi.ActiveMQInitialContextFactory</parameter>
           <parameter name="java.naming.provider.url" locked="false">tcp://localhost:61617</parameter>
           <parameter name="transport.jms.ConnectionFactoryJNDIName" locked="false">QueueConnectionFactory</parameter>
            <parameter name="transport.jms.ConnectionFactoryType" locked="false">queue</parameter>
       </parameter>
   </transportReceiver>
```
5. Uncomment the jms sender in <EI_HOME>/conf/axis2/axis2.xml
```
<transportSender name="jms" class="org.apache.axis2.transport.jms.JMSSender"/>
```

6. Start ActiveMQ server by running `./activemq` on <ACTIVEMQ_HOME>/bin
7. Start EI server by `./integrator.sh` on <EI_HOME>/bin
8. Add [producer_proxy](producer_proxy.xml), [subscriber1](subscriber_proxy1.xml), [subscriber2](subscriber_proxy2.xml) into the proxy services.
9. Evoke the service by running `ant stockquote -Daddurl=http://localhost:8280/services/producer_proxy -Dmode=placeorder -Dsymbol=WSO2`

You can log in into the ActiveMQ console by [http://localhost:8161](http://localhost:8161)