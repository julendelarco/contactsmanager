package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String author;
    @ManyToOne
    @JoinColumn(name="object_type_id", nullable=false)
    private ObjectType objectType;
    @ManyToMany(mappedBy = "objects")
    private Set<Contact> contacts = new HashSet<>();

    public Object(Long id, String title, String author, ObjectType objectType, Set<Contact> contacts) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.objectType = objectType;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", objectType=" + objectType +
                ", contacts=" + contacts +
                '}';
    }
}
