package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;
@Table(name="types")
@Entity
public class Type {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy ="type")
    private List<Car> cars;
}
