package com.project.entity;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name = "t_power")
public class PowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_powerName")
    private String powerName;

    @Column(name = "f_powerUrl")
    private String powerUrl;

    @ManyToOne()
    @JoinColumn(name = "fk_roleId")
    private RoleEntity role;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
