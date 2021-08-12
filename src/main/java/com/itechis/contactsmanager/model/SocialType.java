package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SocialType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String type;
    @OneToMany(mappedBy="socialType")
    private Set<Social> socials;

    public SocialType(Long id, String type, Set<Social> socials) {
        this.id = id;
        this.type = type;
        this.socials = socials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Social> getSocials() {
        return socials;
    }

    public void setSocials(Set<Social> socials) {
        this.socials = socials;
    }

    @Override
    public String toString() {
        return "SocialType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", socials=" + socials +
                '}';
    }
}
