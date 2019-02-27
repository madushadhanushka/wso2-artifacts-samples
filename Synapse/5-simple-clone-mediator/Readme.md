1. Create new mocky endpoint with following payload and replace line #13 in [clone_mediator_proxy.xml](clone_mediator_proxy.xml) with new endpoint.
```
{
   "key": "value"
}
```
2. Add [clone_mediator_proxy.xml](clone_mediator_proxy.xml) into the proxy service.
3. Evoke the proxy service with
<br>`curl -H 'Accept: application/json' -X GET https://localhost:8243/services/clone_proxy`