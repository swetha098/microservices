package com.UST.Flightservices.service;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.entity.Passengerinfo;
import com.UST.Flightservices.entity.Paymentinfo;
import com.UST.Flightservices.exception.InsufficentAmountException;
import com.UST.Flightservices.repo.Passengerrepo;
import com.UST.Flightservices.repo.Paymentrepo;
import com.UST.Flightservices.util.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private Passengerrepo passengerrepo;
    @Autowired
    private Paymentrepo paymentrepo;

    @Transactional
    public FlightBookingAcknowledgement bookingFlightTicket(BookingRequest request) throws InsufficentAmountException {
        Passengerinfo passengerinfo =request.getPassengerinfo();
        passengerinfo=passengerrepo.save(passengerinfo);
        Paymentinfo paymentinfo=request.getPaymentinfo();
        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNo(),passengerinfo.getFare());
        paymentinfo.setPassengerId(passengerinfo.getPId());
        paymentinfo.setAmount(passengerinfo.getFare());
        paymentrepo.save(paymentinfo);
        return new FlightBookingAcknowledgement("success",passengerinfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerinfo);

    }
}
