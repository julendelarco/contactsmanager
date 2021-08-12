package com.itechis.contactsmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ObjectType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String type;
    @OneToMany(mappedBy="objectType")
    private Set<Object> objects;

    public ObjectType(Long id, String type, Set<Object> objects) {
        this.id = id;
        this.type = type;
        this.objects = objects;
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

    public Set<Object> getObjects() {
        return objects;
    }

    public void setObjects(Set<Object> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "ObjectType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", objects=" + objects +
                '}';
    }
}
