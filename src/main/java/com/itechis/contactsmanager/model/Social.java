package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Social {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String username;
    @ManyToOne
    @JoinColumn(name="occupation_type_id", nullable=false)
    private SocialType socialType;
    @ManyToMany(mappedBy = "socials")
    private Set<Contact> contacts = new HashSet<>();
}
