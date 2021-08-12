package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String imageUrl;
    private String name;
    private String surname;
    private String description;
    private Date birthDate;
    private Date meetDate;
    @ManyToOne
    @JoinColumn(name="sex_id", nullable=false)
    private Sex sex;
    @ManyToOne
    @JoinColumn(name="status_id", nullable=false)
    private Status status;
    @ManyToOne
    @JoinColumn(name="note_id", nullable=false)
    private Note note;
    @ManyToOne
    @JoinColumn(name="meet_place_id", nullable=false)
    private Street meetPlace;
    @ManyToOne
    @JoinColumn(name="home_dir_id", nullable=false)
    private Street homeDir;
    @ManyToOne
    @JoinColumn(name="actual_dir_id", nullable=false)
    private Street actualDir;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Contact_Occupation",
            joinColumns = { @JoinColumn(name = "contact_id") },
            inverseJoinColumns = { @JoinColumn(name = "occupation_id") }
    )
    Set<Occupation> occupations = new HashSet<>();
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Contact_Social",
            joinColumns = { @JoinColumn(name = "contact_id") },
            inverseJoinColumns = { @JoinColumn(name = "social_id") }
    )
    Set<Social> socials = new HashSet<>();
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Contact_Object",
            joinColumns = { @JoinColumn(name = "contact_id") },
            inverseJoinColumns = { @JoinColumn(name = "object_id") }
    )
    Set<Object> objects = new HashSet<>();
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Contact_Img",
            joinColumns = { @JoinColumn(name = "contact_id") },
            inverseJoinColumns = { @JoinColumn(name = "img_id") }
    )
    Set<Img> imgs = new HashSet<>();

    public Contact(Long id, String imageUrl, String name, String surname, String description, Date birthDate, Date meetDate, Sex sex, Status status, Note note, Street meetPlace, Street homeDir, Street actualDir, Set<Occupation> occupations, Set<Social> socials, Set<Object> objects, Set<Img> imgs) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.birthDate = birthDate;
        this.meetDate = meetDate;
        this.sex = sex;
        this.status = status;
        this.note = note;
        this.meetPlace = meetPlace;
        this.homeDir = homeDir;
        this.actualDir = actualDir;
        this.occupations = occupations;
        this.socials = socials;
        this.objects = objects;
        this.imgs = imgs;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(Date meetDate) {
        this.meetDate = meetDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Street getMeetPlace() {
        return meetPlace;
    }

    public void setMeetPlace(Street meetPlace) {
        this.meetPlace = meetPlace;
    }

    public Street getHomeDir() {
        return homeDir;
    }

    public void setHomeDir(Street homeDir) {
        this.homeDir = homeDir;
    }

    public Street getActualDir() {
        return actualDir;
    }

    public void setActualDir(Street actualDir) {
        this.actualDir = actualDir;
    }

    public Set<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(Set<Occupation> occupations) {
        this.occupations = occupations;
    }

    public Set<Social> getSocials() {
        return socials;
    }

    public void setSocials(Set<Social> socials) {
        this.socials = socials;
    }

    public Set<Object> getObjects() {
        return objects;
    }

    public void setObjects(Set<Object> objects) {
        this.objects = objects;
    }

    public Set<Img> getImgs() {
        return imgs;
    }

    public void setImgs(Set<Img> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", description='" + description + '\'' +
                ", birthDate=" + birthDate +
                ", meetDate=" + meetDate +
                ", sex=" + sex +
                ", status=" + status +
                ", note=" + note +
                ", meetPlace=" + meetPlace +
                ", homeDir=" + homeDir +
                ", actualDir=" + actualDir +
                ", occupations=" + occupations +
                ", socials=" + socials +
                ", objects=" + objects +
                ", imgs=" + imgs +
                '}';
    }
}
