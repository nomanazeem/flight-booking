package com.nazeem.flight.booking.repository;

import com.nazeem.flight.booking.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
