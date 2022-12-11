package de.thbingen.epro.models;

import de.thbingen.epro.basemodels.AbstractEntity;
import de.thbingen.epro.basemodels.AddressEntity;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address extends AbstractEntity {

    @Column
    private String street;
    @Column
    private String zipCode;
    @Column
    private String country;

    public Address(){

    }
    public Address(String street, String zipCode, String country){
        this.street = street;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
