# QueryPlacesService
Strategy design pattern implementation to deal with Google Place API

# How to test 
  First you need to set your google place api key in resource file located resources/application.yml
  
  After running the project the following api will be available to test:
  
  http://localhost:8080/api/place?query={your place name}
  http://localhost:8080/api/placeDetails?placeId=ChIJ14gJ49NJzDERmsAj2n9LSkY  (you can get placeId by calling the first method)
  http://localhost:8080/api/placeByradar?radius=5000&lat=51.503186&lng=-0.126446&type=atm  (data is just sample data)
  
 # Development 
   This project has been developed using Spring Boot. 
   
 # How to extend 
 
   There is an interface called Place and it supporting all methods and apiKey and apiURL required to communicate with place services .
   In this project just googlePlaceImpl is there. By following the same strategy we can extend this to support Yelp or Foursquare. 

# References 
  I need to appreciate this works that helped me to get initial concepts about google place API java client. my work is just covering some methods and supports
  rest api based on spring boot.
  
  https://github.com/windy1/google-places-api-java/blob/master/src/main/java/se/walkercrou/places/exception/GooglePlacesException.java
  https://github.com/googlemaps/google-maps-services-java
  
  Google API Document : https://developers.google.com/places/web-service/search
  
  