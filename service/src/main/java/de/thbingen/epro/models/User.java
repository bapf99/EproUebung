package de.thbingen.epro.models;

import de.thbingen.epro.basemodels.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column
    private String surname;

    @Column
    private String name;

    @Column
    private String e_mail;

    @Column
    private String password;

    /*@ManyToOne
    private Group group;*/

    /*@OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;*/

    public User(){
        super();
    }
    public User(String surname, String name, String eMail, String password){
        super();
        this.surname = surname;
        this.name = name;
        this.e_mail = eMail;
        this.password = password;
        //this.address = address;
    }

    /*public Group getGroup() { return group; }

    public void setGroup(Group group) { this.group = group; }
*/
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
        return e_mail;
    }

    public void seteMail(String eMail) {
        this.e_mail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/

    public String toString(){
        return "First: " + surname;
    }


}
