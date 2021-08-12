package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Img {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String description;
    private String url;
    @ManyToMany(mappedBy = "imgs")
    private Set<Contact> contacts = new HashSet<>();
}
