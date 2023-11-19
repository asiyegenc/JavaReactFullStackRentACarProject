package com.example.demo.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Table(name="prices")
@Entity
public class Price {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="hourly_fee")
    private BigDecimal hourlyFee;

    @Column(name="daily_fee")
    private BigDecimal dailyFee;

    @Column(name="weekly_fee")
    private BigDecimal weeklyFee;

    @Column(name="mountly_fee")
    private BigDecimal mountlyFee;

    @OneToMany(mappedBy ="price")
    private List<Car> cars;
}
