package com.project.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class RoleEntity {

@Id
//设置列属性
@Column(length = 32)
//自定义策略  定义uuid
@GenericGenerator(name="ruuid",strategy = "uuid")
//getid一个自定义的策略
@GeneratedValue(generator = "ruuid")
    private String id;
@Column(length = 48)
    private String roleName;
@Transient       //暂态  表示此属性不做表对应的列  让orm
    private String powerStr;
//设置列为时间戳
@Column(columnDefinition = "TIMESTAMP")
private String  addDate;
@Column(columnDefinition = "TEXT")
private String info;

@OneToMany(mappedBy = "user")

private Set<UserRoleEntity>  set;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPowerStr() {
        return powerStr;
    }

    public void setPowerStr(String powerStr) {
        this.powerStr = powerStr;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Set<UserRoleEntity> getSet() {
        return set;
    }

    public void setSet(Set<UserRoleEntity> set) {
        this.set = set;
    }
}
