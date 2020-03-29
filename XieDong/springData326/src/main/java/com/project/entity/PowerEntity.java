package com.project.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "power")
public class PowerEntity {


    @Id
    @GenericGenerator(name = "uuuid", strategy = "uuid")
    @GeneratedValue(generator = "uuuid")
    @Column(length = 32)
    private String pid;

    @Column(length = 48)
    private String powerName;


    @Column(length = 96)
    private String url;

    @Column(length = 96)
    private String info;

    @OneToMany(mappedBy = "power")
    private Set<RolePowerEntity> rolePowerEntitySet;

    public PowerEntity() {
    }

    public PowerEntity(String powerName, String url, String info, Set<RolePowerEntity> rolePowerEntitySet) {
        this.powerName = powerName;
        this.url = url;
        this.info = info;
        this.rolePowerEntitySet = rolePowerEntitySet;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Set<RolePowerEntity> getRolePowerEntitySet() {
        return rolePowerEntitySet;
    }

    public void setRolePowerEntitySet(Set<RolePowerEntity> rolePowerEntitySet) {
        this.rolePowerEntitySet = rolePowerEntitySet;
    }
}
