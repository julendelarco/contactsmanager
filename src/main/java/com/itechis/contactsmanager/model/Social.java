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

    public Social(Long id, String username, SocialType socialType, Set<Contact> contacts) {
        this.id = id;
        this.username = username;
        this.socialType = socialType;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SocialType getSocialType() {
        return socialType;
    }

    public void setSocialType(SocialType socialType) {
        this.socialType = socialType;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Social{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", socialType=" + socialType +
                ", contacts=" + contacts +
                '}';
    }
}
