package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String city;
    @OneToMany(mappedBy="city")
    private Set<Street> streets;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=false)
    private Region region;
}
