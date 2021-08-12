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

    public Img(Long id, String description, String url, Set<Contact> contacts) {
        this.id = id;
        this.description = description;
        this.url = url;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
