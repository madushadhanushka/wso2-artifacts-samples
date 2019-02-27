1. Create new mocky endpoint with following payload and replace line #35 in [simple_cache_proxy](simple_cache_proxy.xml) with new mocky endpoint.
```
{
   "key": "value"
}
```
2. Deploy the [simple_cache_proxy](simple_cache_proxy.xml) proxy service in ESB.
3. Evoke the service with
<br>`curl -H 'Accept: application/json' -X GET https://localhost:8243/services/simple_cache_proxy`
