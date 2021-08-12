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
}
