package com.UST.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="payment_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paymentinfo {
    @Id
    @GeneratedValue(generator ="uuid2")
    @GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")

    private String PaymentId;
    private String accountNo;
    private String CardType;
    private Double amount;
    private Long passengerId;


//    public String getAccountNo() {
//        return null;
//    }
//
//    public void setPassangerId(Long pId) {
//    }
//
//    public void setAmount(double fare) {
//    }
}
