package com.nazeem.flight.booking.controller;

import com.nazeem.flight.booking.Dto.BookFlightDto;
import com.nazeem.flight.booking.Dto.FlightBookingAcknowledgement;
import com.nazeem.flight.booking.service.FlightBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightBookController {

    @Autowired
    private FlightBookService flightBookService;

    @PostMapping("/bookFlight")
    public FlightBookingAcknowledgement bookFlight(@RequestBody BookFlightDto bookFlightDto){
        return flightBookService.bookFlight(bookFlightDto);
    }
}
