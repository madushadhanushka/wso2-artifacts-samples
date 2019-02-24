1. Upload [transform.xslt](transform.xslt) file into the "gov:/transform.xslt"
2. Add [xslt_transform_proxy.xml](xslt_transform_proxy.xml) into the proxy service
3. Evoke the service with the following payload
```
{ "ISOMessage": 
    { "data": 
       { "field": 
          [ 
          { "id": "0", "text": "0200" }, 
          { "id": "6", "text": "sd" }, 
          { "id": "4", "text": "000000500000" }, 
          { "id": "7", "text": "0111522180" }, 
          { "id": "11", "text": "123489" }, 
          { "id": "32", "text": "100009" }, 
          { "id": "44", "text": "XYRTUI5269TYUI" }, 
          { "id": "11", "text": "ABCDEFGHIJ" } 
          ] 
       } 
    } 
}
```