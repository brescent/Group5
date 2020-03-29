package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name="role_power")
public class RolePowerEntity {

    @Id
    @GenericGenerator(name="uuuid",strategy = "uuid")
    @GeneratedValue(generator = "uuuid")
    @Column(length = 32)
    private String rpid;

    @ManyToOne
    @JoinColumn(name = "fk_rid")
    private RoleEntity role;

    @ManyToOne
    @JoinColumn(name="fk_pid")

    private PowerEntity power;

    public RolePowerEntity() {
    }

    public RolePowerEntity(RoleEntity role, PowerEntity power) {
        this.role = role;
        this.power = power;
    }

    public String getRpid() {
        return rpid;
    }

    public void setRpid(String rpid) {
        this.rpid = rpid;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public PowerEntity getPower() {
        return power;
    }

    public void setPower(PowerEntity power) {
        this.power = power;
    }
}
