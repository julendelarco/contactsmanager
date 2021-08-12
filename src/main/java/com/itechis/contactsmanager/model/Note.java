package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String note;
    @OneToMany(mappedBy="note")
    private Set<Contact> contacts;

    public Note(Long id, String note, Set<Contact> contacts) {
        this.id = id;
        this.note = note;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
