package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String sex;
    @OneToMany(mappedBy="sex")
    private Set<Contact> contacts;

    public Sex(Long id, String sex, Set<Contact> contacts) {
        this.id = id;
        this.sex = sex;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
