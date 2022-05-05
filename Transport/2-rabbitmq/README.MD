1. Start RabbitMQ with `./sbin/rabbitmq-server` or `brew services start rabbitmq`. Login with http://localhost:15672/ username password guest:guest
2. Add following lines to <EI HOME>/conf/axis2/axis2.xml
  ```
  <transportReceiver name="rabbitmq" class="org.apache.axis2.transport.rabbitmq.RabbitMQListener">
    <parameter name="AMQPConnectionFactory" locked="false">
        <parameter name="rabbitmq.server.host.name" locked="false">localhost</parameter>
     <parameter name="rabbitmq.server.port" locked="false">5672</parameter>
     <parameter name="rabbitmq.server.user.name" locked="false">guest</parameter>
     <parameter name="rabbitmq.server.password" locked="false">guest</parameter>
     <parameter name="rabbitmq.connection.retry.interval" locked="false">10000</parameter>
     <parameter name="rabbitmq.connection.retry.count" locked="false">-1</parameter>
     <parameter name="rabbitmq.message.content.type">application/json</parameter>
    </parameter>
</transportReceiver>
  
  <transportSender name="rabbitmq" class="org.apache.axis2.transport.rabbitmq.RabbitMQSender"/>
  ```
3. Add [amqp-client-5.7.0.jar](https://www.rabbitmq.com/java-client.html) into the <EI HOME>/lib folder
3. Add proxy service [sendMessage.xml](sendMessage.xml) on EI
4. Invoke the proxy service
