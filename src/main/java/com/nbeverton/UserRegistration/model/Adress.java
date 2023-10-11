package com.nbeverton.UserRegistration.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User user;

    private String street;
    private String city;
    private String state;
    private String country;
    private String number;
    private String CEP;


    public Adress() {
    }

    public Adress(int id, String street, String city, String state, String country, String number, String CEP) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.number = number;
        this.CEP = CEP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return id == adress.id && Objects.equals(street, adress.street) && Objects.equals(city, adress.city) && Objects.equals(state, adress.state) && Objects.equals(country, adress.country) && Objects.equals(number, adress.number) && Objects.equals(CEP, adress.CEP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, street, city, state, country, number, CEP);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
