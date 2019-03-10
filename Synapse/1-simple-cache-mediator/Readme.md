1. Create new mocky endpoint with following payload and replace line #35 in [simple_cache_proxy](simple_cache_proxy.xml) with new mocky endpoint.
```
{
   "key": "value"
}
```
2. Deploy the [simple_cache_proxy](simple_cache_proxy.xml) proxy service in ESB.
3. Evoke the service with
<br>`curl -X GET http://localhost:8280/services/simple_cache_proxy.simple_cache_proxyHttpSoap12Endpoint`

<i>In case of SSL error while using curl, use -k option with curl command</i>
