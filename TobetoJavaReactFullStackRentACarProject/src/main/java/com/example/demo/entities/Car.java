package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="cars")
@Entity
public class Car {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="model_year")
    private int modelYear;
    @Column(name="model_name")
    private String modelName;
    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="price_id")
    private Price price;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="color_id")
    private Color color;

    @ManyToOne  // tekil ise join colonunu belirtmemiz lazım (fk kolonu)
    @JoinColumn(name="type_id")
    private Type type;

    @OneToMany(mappedBy = "car")
    private List<Rental> rentals;
    // tekil ise join colonunu belirtmem lazım (fk kolonu)
}
