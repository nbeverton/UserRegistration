package com.nbeverton.UserRegistration.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
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
    private String cep;


    public Adress() {
    }

    public Adress(int id, User user, String street, String city, String state, String country, String number, String cep) {
        this.id = id;
        this.user = user;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.number = number;
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return id == adress.id && Objects.equals(street, adress.street) && Objects.equals(city, adress.city) && Objects.equals(state, adress.state) && Objects.equals(country, adress.country) && Objects.equals(number, adress.number) && Objects.equals(cep, adress.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, street, city, state, country, number, cep);
    }

}
