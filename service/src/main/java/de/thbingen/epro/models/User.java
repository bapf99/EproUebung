package de.thbingen.epro.models;

import de.thbingen.epro.basemodels.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @Column
    private String firstname;

    @Column
    private String name;

    @Column
    private String eMail;

    @Column
    private String password;

    @ManyToOne
    private Group group;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    public User(){
        super();
    }
    public User(String firstName, String name, String eMail, String password, Address address){
        super();
        this.firstname = firstName;
        this.name = name;
        this.eMail = eMail;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
