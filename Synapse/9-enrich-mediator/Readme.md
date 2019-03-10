1. Add [enrich_mediator_proxy.xml](enrich_mediator_proxy.xml) into the proxy service.
2. Evoke service with following payload.
```
<orders>
 <order>
  <price>50.00</price>
  <quantity>500</quantity>
  <symbol>IBM</symbol>
  <comment>REF 10053</comment>
 </order>
 <order>
  <price>18.00</price>
  <quantity>500</quantity>
  <symbol>MSFT</symbol>
  <comment>ref 20088398289</comment>
 </order>
</orders>
```

```
curl -X POST \
  https://localhost:8243/services/enrich_proxy \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/xml' \
  -d '<orders>
 <order>
  <price>50.00</price>
  <quantity>500</quantity>
  <symbol>IBM</symbol>
  <comment>REF 10053</comment>
 </order>
 <order>
  <price>18.00</price>
  <quantity>500</quantity>
  <symbol>MSFT</symbol>
  <comment>ref 20088398289</comment>
 </order>
</orders>'
```
<i>In case of SSL error while using curl, use -k option with curl command</i>