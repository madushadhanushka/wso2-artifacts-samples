1. Create new backend service with mocky with following payload.
```
{
    "Name": "Name123",
    "Status": "Accepted"
}
```
2. Replace endpoint in line #16 in [iterate-mediator-proxy.xml](iterate-mediator-proxy.xml) with new mocky endpoint.
3. Add [iterate-mediator-proxy.xml](iterate-mediator-proxy.xml) into the proxy service.
4. Evoke the service with following JSON payload by calling to "https://localhost:8243/services/iterate_proxy".
```
[{
    "Name": "Name1",
    "Id": 1
},
{
    "Name": "Name2",
    "Id": 2
},
{
    "Name": "Name3",
    "Id": 3
}]
```
<i>In case of SSL error while using curl, use -k option with curl command</i>

```
curl -X POST \
  https://localhost:8243/services/iterate_proxy \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '[{
    "Name": "Name1",
    "Id": 1
},
{
    "Name": "Name2",
    "Id": 2
},
{
    "Name": "Name3",
    "Id": 3
}]'
```