package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String imageUrl;
    private String name;
    private String surname;
    private Date birthDate;
    private Date meet_date;

    public Contact(Long id, String imageUrl, String name, String surname, Date birthDate, Date meet_date) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.meet_date = meet_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getMeet_date() {
        return meet_date;
    }

    public void setMeet_date(Date meet_date) {
        this.meet_date = meet_date;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", meet_date=" + meet_date +
                '}';
    }
}
