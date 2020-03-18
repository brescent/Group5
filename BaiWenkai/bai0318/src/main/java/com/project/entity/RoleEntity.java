package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sys_role")
public class RoleEntity {
    @Id
    @Column(name = "pk_id",length = 32)
    @GenericGenerator(name = "ruuid",strategy = "uuid")
    @GeneratedValue(generator = "ruuid")
    private String id;
    @Column(name = "r_name",length = 80)
    private String name;
    @OneToMany(mappedBy = "role")
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
