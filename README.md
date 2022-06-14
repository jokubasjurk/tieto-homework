# Tietoevry homework assignment

API endpoint POST: /api/trip
simple endpoint, that helps you determine what kind and how many items will you need for your trip.
It takes kilometers and season is required for the request body, like so:
```json 
{
    "kilometers": 210,
    "season": "SUMMER"
}
```
_Available seasons: **WINTER**, **SUMMER**, **AUTUMN**, **SPRING**_
## Run Spring Boot application
```
mvn spring-boot:run
```

