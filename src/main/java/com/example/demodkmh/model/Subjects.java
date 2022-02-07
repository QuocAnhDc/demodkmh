package com.example.demodkmh.model;

import javax.persistence.*;

@Entity
@Table(name = "subject",uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Subjects {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    public Subjects() {
    }

    public Subjects(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
