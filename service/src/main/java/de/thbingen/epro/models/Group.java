package de.thbingen.epro.models;

import de.thbingen.epro.basemodels.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "group")
public class Group extends AbstractEntity {

    @Column
    private String name;

    @Column
    private String description;

    @ManyToMany
    private ArrayList<Right> rights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Right> getRights() {
        return rights;
    }

    public void setRights(ArrayList<Right> rights) {
        this.rights = rights;
    }


}
