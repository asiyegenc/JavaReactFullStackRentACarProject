package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Table(name="paymentMethods")
@Entity
public class PaymentMethod {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="payment_type")
    private String paymentType;
    @Column(name="card_holder_name")
    private String cardHolderName;
    @Column(name="card_number")
    private String cardNumber;
    @Column(name="expiration_date")
    private LocalDateTime expirationDate;
    @Column(name="cvv")
    private Integer cvv;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Rental> rentals;
}
