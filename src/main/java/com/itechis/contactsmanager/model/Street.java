package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String street;
    @OneToMany(mappedBy="meetPlace")
    private Set<Contact> meetPlaceContacts;
    @OneToMany(mappedBy="homeDir")
    private Set<Contact> homeDirContacts;
    @OneToMany(mappedBy="actualDir")
    private Set<Contact> actualDirContacts;
    @ManyToOne
    @JoinColumn(name="city_id", nullable=false)
    private City city;
}
