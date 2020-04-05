package com.project.entity;


import javax.persistence.*;

@Entity
@Table(name = "t_rolePower")
public class RolePowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_powerId")
    private PowerEntity power;

    @ManyToOne
    @JoinColumn(name = "fk_roleId")
    private RoleEntity role;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PowerEntity getPower() {
        return power;
    }

    public void setPower(PowerEntity power) {
        this.power = power;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
