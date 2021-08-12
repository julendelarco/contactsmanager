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

    public Street(Long id, String street, Set<Contact> meetPlaceContacts, Set<Contact> homeDirContacts, Set<Contact> actualDirContacts, City city) {
        this.id = id;
        this.street = street;
        this.meetPlaceContacts = meetPlaceContacts;
        this.homeDirContacts = homeDirContacts;
        this.actualDirContacts = actualDirContacts;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Set<Contact> getMeetPlaceContacts() {
        return meetPlaceContacts;
    }

    public void setMeetPlaceContacts(Set<Contact> meetPlaceContacts) {
        this.meetPlaceContacts = meetPlaceContacts;
    }

    public Set<Contact> getHomeDirContacts() {
        return homeDirContacts;
    }

    public void setHomeDirContacts(Set<Contact> homeDirContacts) {
        this.homeDirContacts = homeDirContacts;
    }

    public Set<Contact> getActualDirContacts() {
        return actualDirContacts;
    }

    public void setActualDirContacts(Set<Contact> actualDirContacts) {
        this.actualDirContacts = actualDirContacts;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", meetPlaceContacts=" + meetPlaceContacts +
                ", homeDirContacts=" + homeDirContacts +
                ", actualDirContacts=" + actualDirContacts +
                ", city=" + city +
                '}';
    }
}
