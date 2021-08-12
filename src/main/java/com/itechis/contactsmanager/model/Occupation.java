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

    public Occupation(Long id, String occupation, OccupationType occupationType, Set<Contact> contacts) {
        this.id = id;
        this.occupation = occupation;
        this.occupationType = occupationType;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public OccupationType getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(OccupationType occupationType) {
        this.occupationType = occupationType;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "id=" + id +
                ", occupation='" + occupation + '\'' +
                ", occupationType=" + occupationType +
                ", contacts=" + contacts +
                '}';
    }
}
