package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String author;
    @ManyToOne
    @JoinColumn(name="object_type_id", nullable=false)
    private ObjectType objectType;
    @ManyToMany(mappedBy = "objects")
    private Set<Contact> contacts = new HashSet<>();
}
