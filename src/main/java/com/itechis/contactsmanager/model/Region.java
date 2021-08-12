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

    public Region(Long id, String region, Set<City> cities, Country country) {
        this.id = id;
        this.region = region;
        this.cities = cities;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", cities=" + cities +
                ", country=" + country +
                '}';
    }
}
