package com.nazeem.flight.booking.service;

import com.nazeem.flight.booking.Dto.BookFlightDto;
import com.nazeem.flight.booking.Dto.FlightBookingAcknowledgement;
import com.nazeem.flight.booking.Utils.PaymentUtils;
import com.nazeem.flight.booking.entity.PassengerInfo;
import com.nazeem.flight.booking.entity.PaymentInfo;
import com.nazeem.flight.booking.repository.PassengerInfoRepository;
import com.nazeem.flight.booking.repository.PaymentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlight(BookFlightDto bookFlightDto){
        //Get Passenger Info
        PassengerInfo passengerInfo = bookFlightDto.getPassengerInfo();
        passengerInfo= passengerInfoRepository.save(passengerInfo);

        //Get Payment Info
        PaymentInfo paymentInfo = bookFlightDto.getPaymentInfo();

        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());

        //Validate Insufficient amount
        boolean sufficientBalance = PaymentUtils.validateAccountPayment(paymentInfo.getAccountNo(), paymentInfo.getAmount());


        paymentInfo = paymentInfoRepository.save(paymentInfo);

        FlightBookingAcknowledgement flightBookingAcknowledgement = new FlightBookingAcknowledgement();
        flightBookingAcknowledgement.setStatus("SUCCESS");
        flightBookingAcknowledgement.setPassengerInfo(passengerInfo);
        flightBookingAcknowledgement.setPnrNo(UUID.randomUUID().toString());

        return flightBookingAcknowledgement;
    }
}
