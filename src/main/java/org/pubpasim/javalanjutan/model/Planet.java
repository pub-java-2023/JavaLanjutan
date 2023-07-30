package org.pubpasim.javalanjutan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Planet {

    @Id
    Long id;
    String name;
    Double diameter;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }
}