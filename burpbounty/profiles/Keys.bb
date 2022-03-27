[
  {
    "ProfileName": "Keys",
    "Name": "",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@burpbounty",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,(?:\\s|\u003d|:|\"|^)AKC[a-zA-Z0-9]{10,}",
      "true,Or,(AAAA[A-Za-z0-9_-]{7}:[A-Za-z0-9_-]{140})",
      "true,Or,github(.{0,20})?(?-i)[\u0027\\\"][0-9a-zA-Z]{35,40}",
      "true,Or,(EAACEdEose0cBA[0-9A-Za-z]+)",
      "true,Or,(facebook|fb)(.{0,20})?(?-i)[\u0027\\\"][0-9a-f]{32}",
      "true,Or,(AIza[0-9A-Za-z-_]{35})",
      "true,Or,heroku.{0,30}[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}",
      "true,Or,heroku(.{0,20})?[\u0027\"][0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}[\u0027\"]",
      "true,Or,([0-9a-f]{32}-us[0-9])",
      "true,Or,(key-[0-9a-zA-Z]{32})",
      "true,Or,SG\\.[0-9A-Za-z\\-_]{22}\\.[0-9A-Za-z\\-_]{43}",
      "true,Or,sauce.{0,50}(\\\\\\\"|\u0027|`)?[0-9a-f-]{36}(\\\\\\\"|\u0027|`)?",
      "true,Or,xox.-[0-9]{12}-[0-9]{12}-[0-9a-zA-Z]{24}",
      "true,Or,(xox[p|b|o|a]-[0-9]{12}-[0-9]{12}-[0-9]{12}-[a-z0-9]{32})",
      "true,Or,(xox[baprs]-([0-9a-zA-Z]{10,48})?)",
      "true,Or,https:\\/\\/hooks.slack.com\\/services\\/T[a-zA-Z0-9_]{8}\\/B[a-zA-Z0-9_]{8}\\/[a-zA-Z0-9_]{24}",
      "true,Or,sq0[a-z]{3}-[0-9A-Za-z\\-_]{22,43}",
      "true,Or,(?:r|s)k_live_[0-9a-zA-Z]{24}",
      "true,Or,(SK[0-9a-fA-F]{32})",
      "true,Or,(R_[0-9a-f]{32})",
      "true,Or,nr-internal-api-key",
      "true,Or,NRAK-[A-Z0-9]{27}",
      "true,Or,NRRA-[a-f0-9]{42}",
      "true,Or,NRAA-[a-f0-9]{27}",
      "true,Or,(?:\\s|\u003d|:|\"|^)AP[\\dABCDEF][a-zA-Z0-9]{8,}",
      "true,Or,codeclima.{0,50}(\\\\\\\"|\u0027|`)?[0-9a-f]{64}(\\\\\\\"|\u0027|`)?",
      "true,Or,(facebook)(.{0,20})?[\u0027\\\"][0-9]{13,17}",
      "true,Or,(facebook).*[\u0027|\\\"][0-9a-f]{32}[\u0027|\\\"]",
      "true,Or,hockey.{0,50}(\\\\\\\"|\u0027|`)?[0-9a-f]{32}(\\\\\\\"|\u0027|`)?",
      "true,Or,[^a-zA-Z0-9](ya29\\.[0-9A-Za-z\\-_]+)",
      "true,Or,key\\\u003d[0-9]+",
      "true,Or,linkedin(.{0,20})?(?-i)[\u0027\\\"][0-9a-z]{12}[\u0027\\\"]",
      "true,Or,linkedin(.{0,20})?[\u0027\\\"][0-9a-z]{16}[\u0027\\\"]",
      "true,Or,X-Octopus-ApiKey",
      "true,Or,X-Nuget-ApiKey",
      "true,Or,access_token\\$production\\$[0-9a-z]{16}\\$[0-9a-f]{32}",
      "true,Or,sk_live_[0-9a-z]{32}",
      "true,Or,sonar.{0,50}(\\\\\\\"|\u0027|`)?[0-9a-f]{40}(\\\\\\\"|\u0027|`)?",
      "true,Or,hawk\\.[0-9A-Za-z\\-_]{20}\\.[0-9A-Za-z\\-_]{20}",
      "true,Or,twitter(.{0,20})?[\u0027\\\"][0-9a-z]{18,25}",
      "true,Or,twitter.{0,30}[\u0027\\\"\\\\s][0-9a-zA-Z]{35,44}[\u0027\\\"\\\\s]"
    ],
    "Tags": [
      "All"
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
    "IsContentType": true,
    "ContentType": "text/css,image/jpeg,image/png,image/svg+xml,image/gif,image/tiff,image/webp,image/x-icon,application/font-woff,image/vnd.microsoft.icon,font/ttf,font/woff2",
    "HttpResponseCode": "",
    "NegativeCT": true,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 2,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "API Key or Token discovered",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "API Key or Token discovered\n\nReferences:\n\n* https://github.com/streaak/keyhacks\u003cbr/\u003e\n* https://cloud.google.com/docs/authentication/api-keys#securing_an_api_key\u003cbr/\u003e\n* https://medium.com/bugbountywriteup/unauthorized-google-maps-api-key-usage-cases-and-why-you-need-to-care-1ccb28bf21e\n\n\u003cbr/\u003e\u003cbr/\u003e- GREP: \u003cbr/\u003e\u003cgrep\u003e\n\u003cbr/\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]