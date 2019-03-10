1. Create two new endpoint with mocky with following payloads.
```
{
    "message":"message1"
}
```

```
{
    "message":"message2"
}
```
2. Replace line #16 with first mocky endpoint address and line #32 with second endpoint in [aggregate_proxy](aggregate_proxy.xml).
3. Add [aggregate_proxy](aggregate_proxy.xml) into the proxy service.
4. Evoke the proxy service with
<br>`curl -H 'Accept: application/json' -X GET https://localhost:8243/services/aggregate_proxy -k`

<i>In case of SSL error while using curl, use -k option with curl command</i>