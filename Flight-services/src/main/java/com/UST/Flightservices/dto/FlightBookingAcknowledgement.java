package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class FlightBookingAcknowledgement {
    private  String Status;
    private double amount;
    private String pnrno;
    private Passengerinfo passengerinfo;
}
