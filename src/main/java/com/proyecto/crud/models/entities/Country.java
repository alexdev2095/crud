package com.proyecto.crud.models.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Constructor vacío
    public Country() {
    }

    // Constructor con todos los argumentos
    public Country(int id, String name) {
        this.id = (long) id;
        this.name = name;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
