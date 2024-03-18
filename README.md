
# Spring Security With JWT
Spring Security with JWT integrates JSON Web Tokens (JWT) for authentication and authorization in Spring applications. JWTs securely transmit user information as claims in a compact format.



## JWT Dependencies Required



```bash
  <!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId> <!-- or jjwt-gson if Gson is preferred -->
			<version>0.11.5</version>
			<scope>runtime</scope>
```


## API Reference

#### Login

```http
  GET localhost:9818/api/v1/login

   Body
  {
  "username": "admin",
  "password": "admin"
}

Response
{
    "username": "admin",
    "jwtToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTcxMDc1NzM1NCwiZXhwIjoxNzEwNzYwOTU0fQ.xcsRbUm7frUdAQGL8nzCHqgBjOuxZfVRpoxkDR557GVxc6DUR6SgwuP9fKsuqYgS0J1GGuDYgX39qkxFKeHIZw"
}
```
#### Error message

## Headers
| Key |      | Value               |
| :-------- | :------- | :------------------------- |
| `Authorization` | |  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTcxMDc1NzM1NCwiZXhwIjoxNzEwNzYwOTU0fQ.xcsRbUm7frUdAQGL8nzCHqgBjOuxZfVRpoxkDR557GVxc6DUR6SgwuP9fKsuqYgS0J1GGuDYgX39qkxFKeHI  |

if jwtToken is Wrong
```
{
    "status": 406,
    "error": "the provided token is incorrect ",
    "message": "Full authentication is required to access this resource"
}
```

#### Get Countries

```http
  localhost:9818/api/v1/countries
```

## Headers
| Key |      | Value               |
| :-------- | :------- | :------------------------- |
| `Authorization` | | Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTcxMDc1NzM1NCwiZXhwIjoxNzEwNzYwOTU0fQ.xcsRbUm7frUdAQGL8nzCHqgBjOuxZfVRpoxkDR557GVxc6DUR6SgwuP9fKsuqYgS0J1GGuDYgX39qkxFKeHIZw |

```
 [
    {
        "id": 1,
        "countryCode": "AF",
        "countryName": "Afghanistan"
    },
    {
        "id": 2,
        "countryCode": "AX",
        "countryName": "Åland Islands"
    },
    {
        "id": 3,
        "countryCode": "AL",
        "countryName": "Albania"
    },
    {
        "id": 4,
        "countryCode": "DZ",
        "countryName": "Algeria"
    },
    {
        "id": 5,
        "countryCode": "AS",
        "countryName": "American Samoa"
    },
    {
        "id": 6,
        "countryCode": "AD",
        "countryName": "AndorrA"
    },
    {
        "id": 7,
        "countryCode": "AO",
        "countryName": "Angola"
    },
    {
        "id": 8,
        "countryCode": "AI",
        "countryName": "Anguilla"
    },
    {
        "id": 9,
        "countryCode": "AQ",
        "countryName": "Antarctica"
    },
    {
        "id": 10,
        "countryCode": "AG",
        "countryName": "Antigua and Barbuda"
    },
    {
        "id": 11,
        "countryCode": "AR",
        "countryName": "Argentina"
    },
    {
        "id": 12,
        "countryCode": "AM",
        "countryName": "Armenia"
    },
    {
        "id": 13,
        "countryCode": "AW",
        "countryName": "Aruba"
    },
    {
        "id": 14,
        "countryCode": "AU",
        "countryName": "Australia"
    },
    {
        "id": 15,
        "countryCode": "AT",
        "countryName": "Austria"
    },
    {
        "id": 16,
        "countryCode": "AZ",
        "countryName": "Azerbaijan"
    },
    {
        "id": 17,
        "countryCode": "BS",
        "countryName": "Bahamas"
    },
    {
        "id": 18,
        "countryCode": "BH",
        "countryName": "Bahrain"
    },
    {
        "id": 19,
        "countryCode": "BD",
        "countryName": "Bangladesh"
    },
    {
        "id": 20,
        "countryCode": "BB",
        "countryName": "Barbados"
    },
    {
        "id": 21,
        "countryCode": "BY",
        "countryName": "Belarus"
    },
    {
        "id": 22,
        "countryCode": "BE",
        "countryName": "Belgium"
    },
    {
        "id": 23,
        "countryCode": "BZ",
        "countryName": "Belize"
    },
    {
        "id": 24,
        "countryCode": "BJ",
        "countryName": "Benin"
    },
    {
        "id": 25,
        "countryCode": "BM",
        "countryName": "Bermuda"
    },
    {
        "id": 26,
        "countryCode": "BT",
        "countryName": "Bhutan"
    },
    {
        "id": 27,
        "countryCode": "BO",
        "countryName": "Bolivia"
    },
    {
        "id": 28,
        "countryCode": "BA",
        "countryName": "Bosnia and Herzegovina"
    },
    {
        "id": 29,
        "countryCode": "BW",
        "countryName": "Botswana"
    },
    {
        "id": 30,
        "countryCode": "BV",
        "countryName": "Bouvet Island"
    },
    {
        "id": 31,
        "countryCode": "BR",
        "countryName": "Brazil"
    },
    {
        "id": 32,
        "countryCode": "IO",
        "countryName": "British Indian Ocean Territory"
    },
    {
        "id": 33,
        "countryCode": "BN",
        "countryName": "Brunei Darussalam"
    },
    {
        "id": 34,
        "countryCode": "BG",
        "countryName": "Bulgaria"
    },
    {
        "id": 35,
        "countryCode": "BF",
        "countryName": "Burkina Faso"
    },
    {
        "id": 36,
        "countryCode": "BI",
        "countryName": "Burundi"
    },
    {
        "id": 37,
        "countryCode": "KH",
        "countryName": "Cambodia"
    },
    {
        "id": 38,
        "countryCode": "CM",
        "countryName": "Cameroon"
    },
    {
        "id": 39,
        "countryCode": "CA",
        "countryName": "Canada"
    },
    {
        "id": 40,
        "countryCode": "CV",
        "countryName": "Cape Verde"
    },
    {
        "id": 41,
        "countryCode": "KY",
        "countryName": "Cayman Islands"
    },
    {
        "id": 42,
        "countryCode": "CF",
        "countryName": "Central African Republic"
    },
    {
        "id": 43,
        "countryCode": "TD",
        "countryName": "Chad"
    },
    {
        "id": 44,
        "countryCode": "CL",
        "countryName": "Chile"
    },
    {
        "id": 45,
        "countryCode": "CN",
        "countryName": "China"
    },
    {
        "id": 46,
        "countryCode": "CX",
        "countryName": "Christmas Island"
    },
    {
        "id": 47,
        "countryCode": "CC",
        "countryName": "Cocos (Keeling) Islands"
    },
    {
        "id": 48,
        "countryCode": "CO",
        "countryName": "Colombia"
    },
    {
        "id": 49,
        "countryCode": "KM",
        "countryName": "Comoros"
    },
    {
        "id": 50,
        "countryCode": "CG",
        "countryName": "Congo"
    },
    {
        "id": 51,
        "countryCode": "CD",
        "countryName": "Congo, The Democratic Republic of the"
    },
    {
        "id": 52,
        "countryCode": "CK",
        "countryName": "Cook Islands"
    },
    {
        "id": 53,
        "countryCode": "CR",
        "countryName": "Costa Rica"
    },
    {
        "id": 54,
        "countryCode": "CI",
        "countryName": "Cote D\\Ivoire"
    },
    {
        "id": 55,
        "countryCode": "HR",
        "countryName": "Croatia"
    },
    {
        "id": 56,
        "countryCode": "CU",
        "countryName": "Cuba"
    },
    {
        "id": 57,
        "countryCode": "CY",
        "countryName": "Cyprus"
    },
    {
        "id": 58,
        "countryCode": "CZ",
        "countryName": "Czech Republic"
    },
    {
        "id": 59,
        "countryCode": "DK",
        "countryName": "Denmark"
    },
    {
        "id": 60,
        "countryCode": "DJ",
        "countryName": "Djibouti"
    },
    {
        "id": 61,
        "countryCode": "DM",
        "countryName": "Dominica"
    },
    {
        "id": 62,
        "countryCode": "DO",
        "countryName": "Dominican Republic"
    },
    {
        "id": 63,
        "countryCode": "EC",
        "countryName": "Ecuador"
    },
    {
        "id": 64,
        "countryCode": "EG",
        "countryName": "Egypt"
    },
    {
        "id": 65,
        "countryCode": "SV",
        "countryName": "El Salvador"
    },
    {
        "id": 66,
        "countryCode": "GQ",
        "countryName": "Equatorial Guinea"
    },
    {
        "id": 67,
        "countryCode": "ER",
        "countryName": "Eritrea"
    },
    {
        "id": 68,
        "countryCode": "EE",
        "countryName": "Estonia"
    },
    {
        "id": 69,
        "countryCode": "ET",
        "countryName": "Ethiopia"
    },
    {
        "id": 70,
        "countryCode": "FK",
        "countryName": "Falkland Islands (Malvinas)"
    },
    {
        "id": 71,
        "countryCode": "FO",
        "countryName": "Faroe Islands"
    },
    {
        "id": 72,
        "countryCode": "FJ",
        "countryName": "Fiji"
    },
    {
        "id": 73,
        "countryCode": "FI",
        "countryName": "Finland"
    },
    {
        "id": 74,
        "countryCode": "FR",
        "countryName": "France"
    },
    {
        "id": 75,
        "countryCode": "GF",
        "countryName": "French Guiana"
    },
    {
        "id": 76,
        "countryCode": "PF",
        "countryName": "French Polynesia"
    },
    {
        "id": 77,
        "countryCode": "TF",
        "countryName": "French Southern Territories"
    },
    {
        "id": 78,
        "countryCode": "GA",
        "countryName": "Gabon"
    },
    {
        "id": 79,
        "countryCode": "GM",
        "countryName": "Gambia"
    },
    {
        "id": 80,
        "countryCode": "GE",
        "countryName": "Georgia"
    },
    {
        "id": 81,
        "countryCode": "DE",
        "countryName": "Germany"
    },
    {
        "id": 82,
        "countryCode": "GH",
        "countryName": "Ghana"
    },
    {
        "id": 83,
        "countryCode": "GI",
        "countryName": "Gibraltar"
    },
    {
        "id": 84,
        "countryCode": "GR",
        "countryName": "Greece"
    },
    {
        "id": 85,
        "countryCode": "GL",
        "countryName": "Greenland"
    },
    {
        "id": 86,
        "countryCode": "GD",
        "countryName": "Grenada"
    },
    {
        "id": 87,
        "countryCode": "GP",
        "countryName": "Guadeloupe"
    },
    {
        "id": 88,
        "countryCode": "GU",
        "countryName": "Guam"
    },
    {
        "id": 89,
        "countryCode": "GT",
        "countryName": "Guatemala"
    },
    {
        "id": 90,
        "countryCode": "GG",
        "countryName": "Guernsey"
    },
    {
        "id": 91,
        "countryCode": "GN",
        "countryName": "Guinea"
    },
    {
        "id": 92,
        "countryCode": "GW",
        "countryName": "Guinea-Bissau"
    },
    {
        "id": 93,
        "countryCode": "GY",
        "countryName": "Guyana"
    },
    {
        "id": 94,
        "countryCode": "HT",
        "countryName": "Haiti"
    },
    {
        "id": 95,
        "countryCode": "HM",
        "countryName": "Heard Island and Mcdonald Islands"
    },
    {
        "id": 96,
        "countryCode": "VA",
        "countryName": "Holy See (Vatican City State)"
    },
    {
        "id": 97,
        "countryCode": "HN",
        "countryName": "Honduras"
    },
    {
        "id": 98,
        "countryCode": "HK",
        "countryName": "Hong Kong"
    },
    {
        "id": 99,
        "countryCode": "HU",
        "countryName": "Hungary"
    },
    {
        "id": 100,
        "countryCode": "IS",
        "countryName": "Iceland"
    },
    {
        "id": 101,
        "countryCode": "IN",
        "countryName": "India"
    },
    {
        "id": 102,
        "countryCode": "ID",
        "countryName": "Indonesia"
    },
    {
        "id": 103,
        "countryCode": "IR",
        "countryName": "Iran, Islamic Republic Of"
    },
    {
        "id": 104,
        "countryCode": "IQ",
        "countryName": "Iraq"
    },
    {
        "id": 105,
        "countryCode": "IE",
        "countryName": "Ireland"
    },
    {
        "id": 106,
        "countryCode": "IM",
        "countryName": "Isle of Man"
    },
    {
        "id": 107,
        "countryCode": "IL",
        "countryName": "Israel"
    },
    {
        "id": 108,
        "countryCode": "IT",
        "countryName": "Italy"
    },
    {
        "id": 109,
        "countryCode": "JM",
        "countryName": "Jamaica"
    },
    {
        "id": 110,
        "countryCode": "JP",
        "countryName": "Japan"
    },
    {
        "id": 111,
        "countryCode": "JE",
        "countryName": "Jersey"
    },
    {
        "id": 112,
        "countryCode": "JO",
        "countryName": "Jordan"
    },
    {
        "id": 113,
        "countryCode": "KZ",
        "countryName": "Kazakhstan"
    },
    {
        "id": 114,
        "countryCode": "KE",
        "countryName": "Kenya"
    },
    {
        "id": 115,
        "countryCode": "KI",
        "countryName": "Kiribati"
    },
    {
        "id": 116,
        "countryCode": "KP",
        "countryName": "Korea, Democratic People\\S Republic of"
    },
    {
        "id": 117,
        "countryCode": "KR",
        "countryName": "Korea, Republic of"
    },
    {
        "id": 118,
        "countryCode": "KW",
        "countryName": "Kuwait"
    },
    {
        "id": 119,
        "countryCode": "KG",
        "countryName": "Kyrgyzstan"
    },
    {
        "id": 120,
        "countryCode": "LA",
        "countryName": "Lao People\\S Democratic Republic"
    },
    {
        "id": 121,
        "countryCode": "LV",
        "countryName": "Latvia"
    },
    {
        "id": 122,
        "countryCode": "LB",
        "countryName": "Lebanon"
    },
    {
        "id": 123,
        "countryCode": "LS",
        "countryName": "Lesotho"
    },
    {
        "id": 124,
        "countryCode": "LR",
        "countryName": "Liberia"
    },
    {
        "id": 125,
        "countryCode": "LY",
        "countryName": "Libyan Arab Jamahiriya"
    },
    {
        "id": 126,
        "countryCode": "LI",
        "countryName": "Liechtenstein"
    },
    {
        "id": 127,
        "countryCode": "LT",
        "countryName": "Lithuania"
    },
    {
        "id": 128,
        "countryCode": "LU",
        "countryName": "Luxembourg"
    },
    {
        "id": 129,
        "countryCode": "MO",
        "countryName": "Macao"
    },
    {
        "id": 130,
        "countryCode": "MK",
        "countryName": "Macedonia, The Former Yugoslav Republic of"
    },
    {
        "id": 131,
        "countryCode": "MG",
        "countryName": "Madagascar"
    },
    {
        "id": 132,
        "countryCode": "MW",
        "countryName": "Malawi"
    },
    {
        "id": 133,
        "countryCode": "MY",
        "countryName": "Malaysia"
    },
    {
        "id": 134,
        "countryCode": "MV",
        "countryName": "Maldives"
    },
    {
        "id": 135,
        "countryCode": "ML",
        "countryName": "Mali"
    },
    {
        "id": 136,
        "countryCode": "MT",
        "countryName": "Malta"
    },
    {
        "id": 137,
        "countryCode": "MH",
        "countryName": "Marshall Islands"
    },
    {
        "id": 138,
        "countryCode": "MQ",
        "countryName": "Martinique"
    },
    {
        "id": 139,
        "countryCode": "MR",
        "countryName": "Mauritania"
    },
    {
        "id": 140,
        "countryCode": "MU",
        "countryName": "Mauritius"
    },
    {
        "id": 141,
        "countryCode": "YT",
        "countryName": "Mayotte"
    },
    {
        "id": 142,
        "countryCode": "MX",
        "countryName": "Mexico"
    },
    {
        "id": 143,
        "countryCode": "FM",
        "countryName": "Micronesia, Federated States of"
    },
    {
        "id": 144,
        "countryCode": "MD",
        "countryName": "Moldova, Republic of"
    },
    {
        "id": 145,
        "countryCode": "MC",
        "countryName": "Monaco"
    },
    {
        "id": 146,
        "countryCode": "MN",
        "countryName": "Mongolia"
    },
    {
        "id": 147,
        "countryCode": "MS",
        "countryName": "Montserrat"
    },
    {
        "id": 148,
        "countryCode": "MA",
        "countryName": "Morocco"
    },
    {
        "id": 149,
        "countryCode": "MZ",
        "countryName": "Mozambique"
    },
    {
        "id": 150,
        "countryCode": "MM",
        "countryName": "Myanmar"
    },
    {
        "id": 151,
        "countryCode": "NA",
        "countryName": "Namibia"
    },
    {
        "id": 152,
        "countryCode": "NR",
        "countryName": "Nauru"
    },
    {
        "id": 153,
        "countryCode": "NP",
        "countryName": "Nepal"
    },
    {
        "id": 154,
        "countryCode": "NL",
        "countryName": "Netherlands"
    },
    {
        "id": 155,
        "countryCode": "AN",
        "countryName": "Netherlands Antilles"
    },
    {
        "id": 156,
        "countryCode": "NC",
        "countryName": "New Caledonia"
    },
    {
        "id": 157,
        "countryCode": "NZ",
        "countryName": "New Zealand"
    },
    {
        "id": 158,
        "countryCode": "NI",
        "countryName": "Nicaragua"
    },
    {
        "id": 159,
        "countryCode": "NE",
        "countryName": "Niger"
    },
    {
        "id": 160,
        "countryCode": "NG",
        "countryName": "Nigeria"
    },
    {
        "id": 161,
        "countryCode": "NU",
        "countryName": "Niue"
    },
    {
        "id": 162,
        "countryCode": "NF",
        "countryName": "Norfolk Island"
    },
    {
        "id": 163,
        "countryCode": "MP",
        "countryName": "Northern Mariana Islands"
    },
    {
        "id": 164,
        "countryCode": "NO",
        "countryName": "Norway"
    },
    {
        "id": 165,
        "countryCode": "OM",
        "countryName": "Oman"
    },
    {
        "id": 166,
        "countryCode": "PK",
        "countryName": "Pakistan"
    },
    {
        "id": 167,
        "countryCode": "PW",
        "countryName": "Palau"
    },
    {
        "id": 168,
        "countryCode": "PS",
        "countryName": "Palestinian Territory, Occupied"
    },
    {
        "id": 169,
        "countryCode": "PA",
        "countryName": "Panama"
    },
    {
        "id": 170,
        "countryCode": "PG",
        "countryName": "Papua New Guinea"
    },
    {
        "id": 171,
        "countryCode": "PY",
        "countryName": "Paraguay"
    },
    {
        "id": 172,
        "countryCode": "PE",
        "countryName": "Peru"
    },
    {
        "id": 173,
        "countryCode": "PH",
        "countryName": "Philippines"
    },
    {
        "id": 174,
        "countryCode": "PN",
        "countryName": "Pitcairn"
    },
    {
        "id": 175,
        "countryCode": "PL",
        "countryName": "Poland"
    },
    {
        "id": 176,
        "countryCode": "PT",
        "countryName": "Portugal"
    },
    {
        "id": 177,
        "countryCode": "PR",
        "countryName": "Puerto Rico"
    },
    {
        "id": 178,
        "countryCode": "QA",
        "countryName": "Qatar"
    },
    {
        "id": 179,
        "countryCode": "RE",
        "countryName": "Reunion"
    },
    {
        "id": 180,
        "countryCode": "RO",
        "countryName": "Romania"
    },
    {
        "id": 181,
        "countryCode": "RU",
        "countryName": "Russian Federation"
    },
    {
        "id": 182,
        "countryCode": "RW",
        "countryName": "RWANDA"
    },
    {
        "id": 183,
        "countryCode": "SH",
        "countryName": "Saint Helena"
    },
    {
        "id": 184,
        "countryCode": "KN",
        "countryName": "Saint Kitts and Nevis"
    },
    {
        "id": 185,
        "countryCode": "LC",
        "countryName": "Saint Lucia"
    },
    {
        "id": 186,
        "countryCode": "PM",
        "countryName": "Saint Pierre and Miquelon"
    },
    {
        "id": 187,
        "countryCode": "VC",
        "countryName": "Saint Vincent and the Grenadines"
    },
    {
        "id": 188,
        "countryCode": "WS",
        "countryName": "Samoa"
    },
    {
        "id": 189,
        "countryCode": "SM",
        "countryName": "San Marino"
    },
    {
        "id": 190,
        "countryCode": "ST",
        "countryName": "Sao Tome and Principe"
    },
    {
        "id": 191,
        "countryCode": "SA",
        "countryName": "Saudi Arabia"
    },
    {
        "id": 192,
        "countryCode": "SN",
        "countryName": "Senegal"
    },
    {
        "id": 193,
        "countryCode": "CS",
        "countryName": "Serbia and Montenegro"
    },
    {
        "id": 194,
        "countryCode": "SC",
        "countryName": "Seychelles"
    },
    {
        "id": 195,
        "countryCode": "SL",
        "countryName": "Sierra Leone"
    },
    {
        "id": 196,
        "countryCode": "SG",
        "countryName": "Singapore"
    },
    {
        "id": 197,
        "countryCode": "SK",
        "countryName": "Slovakia"
    },
    {
        "id": 198,
        "countryCode": "SI",
        "countryName": "Slovenia"
    },
    {
        "id": 199,
        "countryCode": "SB",
        "countryName": "Solomon Islands"
    },
    {
        "id": 200,
        "countryCode": "SO",
        "countryName": "Somalia"
    },
    {
        "id": 201,
        "countryCode": "ZA",
        "countryName": "South Africa"
    },
    {
        "id": 202,
        "countryCode": "GS",
        "countryName": "South Georgia and the South Sandwich Islands"
    },
    {
        "id": 203,
        "countryCode": "ES",
        "countryName": "Spain"
    },
    {
        "id": 204,
        "countryCode": "LK",
        "countryName": "Sri Lanka"
    },
    {
        "id": 205,
        "countryCode": "SD",
        "countryName": "Sudan"
    },
    {
        "id": 206,
        "countryCode": "SR",
        "countryName": "Suriname"
    },
    {
        "id": 207,
        "countryCode": "SJ",
        "countryName": "Svalbard and Jan Mayen"
    },
    {
        "id": 208,
        "countryCode": "SZ",
        "countryName": "Swaziland"
    },
    {
        "id": 209,
        "countryCode": "SE",
        "countryName": "Sweden"
    },
    {
        "id": 210,
        "countryCode": "CH",
        "countryName": "Switzerland"
    },
    {
        "id": 211,
        "countryCode": "SY",
        "countryName": "Syrian Arab Republic"
    },
    {
        "id": 212,
        "countryCode": "TW",
        "countryName": "Taiwan, Province of China"
    },
    {
        "id": 213,
        "countryCode": "TJ",
        "countryName": "Tajikistan"
    },
    {
        "id": 214,
        "countryCode": "TZ",
        "countryName": "Tanzania, United Republic of"
    },
    {
        "id": 215,
        "countryCode": "TH",
        "countryName": "Thailand"
    },
    {
        "id": 216,
        "countryCode": "TL",
        "countryName": "Timor-Leste"
    },
    {
        "id": 217,
        "countryCode": "TG",
        "countryName": "Togo"
    },
    {
        "id": 218,
        "countryCode": "TK",
        "countryName": "Tokelau"
    },
    {
        "id": 219,
        "countryCode": "TO",
        "countryName": "Tonga"
    },
    {
        "id": 220,
        "countryCode": "TT",
        "countryName": "Trinidad and Tobago"
    },
    {
        "id": 221,
        "countryCode": "TN",
        "countryName": "Tunisia"
    },
    {
        "id": 222,
        "countryCode": "TR",
        "countryName": "Turkey"
    },
    {
        "id": 223,
        "countryCode": "TM",
        "countryName": "Turkmenistan"
    },
    {
        "id": 224,
        "countryCode": "TC",
        "countryName": "Turks and Caicos Islands"
    },
    {
        "id": 225,
        "countryCode": "TV",
        "countryName": "Tuvalu"
    },
    {
        "id": 226,
        "countryCode": "UG",
        "countryName": "Uganda"
    },
    {
        "id": 227,
        "countryCode": "UA",
        "countryName": "Ukraine"
    },
    {
        "id": 228,
        "countryCode": "AE",
        "countryName": "United Arab Emirates"
    },
    {
        "id": 229,
        "countryCode": "GB",
        "countryName": "United Kingdom"
    },
    {
        "id": 230,
        "countryCode": "US",
        "countryName": "United States"
    },
    {
        "id": 231,
        "countryCode": "UM",
        "countryName": "United States Minor Outlying Islands"
    },
    {
        "id": 232,
        "countryCode": "UY",
        "countryName": "Uruguay"
    },
    {
        "id": 233,
        "countryCode": "UZ",
        "countryName": "Uzbekistan"
    },
    {
        "id": 234,
        "countryCode": "VU",
        "countryName": "Vanuatu"
    },
    {
        "id": 235,
        "countryCode": "VE",
        "countryName": "Venezuela"
    },
    {
        "id": 236,
        "countryCode": "VN",
        "countryName": "Viet Nam"
    },
    {
        "id": 237,
        "countryCode": "VG",
        "countryName": "Virgin Islands, British"
    },
    {
        "id": 238,
        "countryCode": "VI",
        "countryName": "Virgin Islands, U.S."
    },
    {
        "id": 239,
        "countryCode": "WF",
        "countryName": "Wallis and Futuna"
    },
    {
        "id": 240,
        "countryCode": "EH",
        "countryName": "Western Sahara"
    },
    {
        "id": 241,
        "countryCode": "YE",
        "countryName": "Yemen"
    },
    {
        "id": 242,
        "countryCode": "ZM",
        "countryName": "Zambia"
    },
    {
        "id": 243,
        "countryCode": "ZW",
        "countryName": "Zimbabwe"
    }
]
```

