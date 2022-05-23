package com.nazeem.flight.booking.Utils;

import com.nazeem.flight.booking.Dto.BookFlightDto;
import com.nazeem.flight.booking.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    public static Map<String, Double> paymentAccounts = new HashMap<>();
    static{
        paymentAccounts.put("acct1", 12000D);
        paymentAccounts.put("acct2", 1000D);
        paymentAccounts.put("acct3", 5000D);
        paymentAccounts.put("acct4", 7000D);
        paymentAccounts.put("acct5", 8000D);
    }

    public static boolean validateAccountPayment(String accountNo, Double payAmount){
        if(payAmount > paymentAccounts.get(accountNo)){
            throw new InsufficientAmountException("Invalid sufficient balance...");
        }
        return true;
    }
}
