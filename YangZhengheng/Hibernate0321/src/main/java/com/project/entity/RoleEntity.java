package com.project.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="t_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_roleName")
    private  String   roleName;

    @Column(name = "f_roleInfo")
    private String info;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_userId")
    private UserEntity user;

    @OneToMany(mappedBy = "role")
    private List<PowerEntity> powerList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        roleName = roleName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<PowerEntity> getPowerList() {
        return powerList;
    }

    public void setPowerList(List<PowerEntity> powerList) {
        this.powerList = powerList;
    }
}
