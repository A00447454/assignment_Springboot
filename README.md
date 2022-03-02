# **assignment_Springboot**
Springboot Rest API Assignment

A hotel reservation system using java springboot
 
## Post: To add new hotel into the database
API URL:
http://localhost:8080/hotelInsert/

parameters: id (int) - ID number- Primary key.(auto increments)
            name(String)- Hotel name
            price(Float)- Price of the room per night          
Example: 
 {
    "name":"HolidayInn",
    "price":799
}

## Get: Get List of hotels available in database
API URL:
http://localhost:8080/hotels

Response: Added Successfully

