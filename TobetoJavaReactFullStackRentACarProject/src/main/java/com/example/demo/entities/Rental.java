package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name="rentals")
@Entity
public class Rental {
    @Id   // eğer primary key (PK) ise bu şekilde belirtmemiz gerekiyor
    @Column(name="id") //name  = kolon adı
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  //classın içindeki alanın adı

    @Column(name="rental_date")
    private LocalDateTime rentalDate;
    @Column(name="return_date")
    private LocalDateTime returnDate;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name="payment_method_id")
    private PaymentMethod paymentMethod;
}
