package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class OccupationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String type;
    @OneToMany(mappedBy="occupationType")
    private Set<Occupation> occupations;

    public OccupationType(Long id, String type, Set<Occupation> occupations) {
        this.id = id;
        this.type = type;
        this.occupations = occupations;
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

    public Set<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(Set<Occupation> occupations) {
        this.occupations = occupations;
    }

    @Override
    public String toString() {
        return "OccupationType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", occupations=" + occupations +
                '}';
    }
}
