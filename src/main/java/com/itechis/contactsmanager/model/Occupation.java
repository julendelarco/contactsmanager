package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Occupation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String occupation;
    @ManyToOne
    @JoinColumn(name="occupation_type_id", nullable=false)
    private OccupationType occupationType;
    @ManyToMany(mappedBy = "occupations")
    private Set<Contact> contacts = new HashSet<>();
}
