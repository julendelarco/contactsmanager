package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String region;
    @OneToMany(mappedBy="region")
    private Set<City> cities;
    @ManyToOne
    @JoinColumn(name="country_id", nullable=false)
    private Country country;
}
