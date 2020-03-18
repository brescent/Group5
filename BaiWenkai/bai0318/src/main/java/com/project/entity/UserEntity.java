package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sys_user")
public class UserEntity {
    @Id
    @Column(name = "pk_id",length = 32)
    @GenericGenerator(name = "uuuid",strategy = "uuid")
    @GeneratedValue(generator = "uuuid")
    private String id;
    @Column(name = "u_name",length = 80)
    private String name;
    @OneToMany(mappedBy = "user")
    private Set<UserRoleEntity> castSet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRoleEntity> getCastSet() {
        return castSet;
    }

    public void setCastSet(Set<UserRoleEntity> castSet) {
        this.castSet = castSet;
    }
}
