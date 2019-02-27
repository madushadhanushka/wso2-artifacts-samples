1. Upload [Hello.xsd](Hello.xsd) into the "gov:/custom/HelloSchema.xsd".
2. Upload [HelloSchema.xsd](HelloSchema.xsd) into the "gov:/custom/xsd/Hello.xsd"
3. Add [validate_multiple_proxy.xml](validate_multiple_proxy.xml) into the proxy service.
4. 
- Evoke the service with following payload for valid case.
```
<p:greet xmlns:p="http://www.wso2.org/types" xmlns:q="http://www.wso2.org/hello">
        <q:name>hello</q:name>
</p:greet>
```
- Evoke with following payload for invalid case.
```
<p:greet xmlns:p="http://www.wso2.org/types" xmlns:q="http://www.wso2.org/hello">
        <q:name></q:name>
</p:greet>
```