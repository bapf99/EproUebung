package de.thbingen.epro.models;

import org.springframework.stereotype.Component;

public class User {

    private String surname;
    private String name;
    private String eMail;
    private Address address;

    public User(String surname, String name, String eMail, Address address){
        this.surname = surname;
        this.name = name;
        this.eMail = eMail;
        this.address = address;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
