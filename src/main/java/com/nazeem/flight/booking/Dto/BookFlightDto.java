package com.nazeem.flight.booking.Dto;

import com.nazeem.flight.booking.entity.PassengerInfo;
import com.nazeem.flight.booking.entity.PaymentInfo;
import com.nazeem.flight.booking.repository.PaymentInfoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookFlightDto {

    private PaymentInfo paymentInfo;
    private PassengerInfo passengerInfo;
}
