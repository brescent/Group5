package com.project.entity;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_power")
public class PowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_powerName")
    private  String powerName;


    @Column(name = "f_powerUrl")
    private String powerUrl;

    @OneToMany(mappedBy = "power")
    private List<RolePowerEntity> rolePowerList;

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

    public List<RolePowerEntity> getRolePowerList() {
        return rolePowerList;
    }

    public void setRolePowerList(List<RolePowerEntity> rolePowerList) {
        this.rolePowerList = rolePowerList;
    }
}
