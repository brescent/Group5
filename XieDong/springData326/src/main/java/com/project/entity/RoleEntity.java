package com.project.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="role")
public class RoleEntity {

    @Id
    @GenericGenerator(name="uuuid",strategy = "uuid")
    @GeneratedValue(generator = "uuuid")
    @Column(length = 32)
    private String rid;

    @Column(length = 48)
    private String roleName;

    @OneToMany(mappedBy = "role")
    private Set<RolePowerEntity> rolePowerEntitySet;

    public RoleEntity() {
    }

    public RoleEntity(String roleName, Set<RolePowerEntity> rolePowerEntitySet) {
        this.roleName = roleName;
        this.rolePowerEntitySet = rolePowerEntitySet;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<RolePowerEntity> getRolePowerEntitySet() {
        return rolePowerEntitySet;
    }

    public void setRolePowerEntitySet(Set<RolePowerEntity> rolePowerEntitySet) {
        this.rolePowerEntitySet = rolePowerEntitySet;
    }
}
