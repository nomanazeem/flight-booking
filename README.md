# flight-booking

Spring transaction demo

h2-console 
http://localhost:8080/h2-console/


payload for sending request

url:localhost:8080/flight/bookFlight
post request
body: 
{
    "passengerInfo": {
        "name": "noman",
        "email": "noman@gmail.com",
        "source": "islamabad",
        "destination": "karachi",
        "travelDate": "12-01-2022",
        "pickupTime": "12:00PM",
        "arrivalTime": "2:00PM",
        "fare": "9000"
    },
    "paymentInfo": {
        "accountNo": "acct1",
        "cardType": "VISA"
    }
}
