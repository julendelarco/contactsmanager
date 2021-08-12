package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String country;
    @OneToMany(mappedBy="country")
    private Set<Region> regions;

    public Country(Long id, String country, Set<Region> regions) {
        this.id = id;
        this.country = country;
        this.regions = regions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", regions=" + regions +
                '}';
    }
}
