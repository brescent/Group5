package com.project.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class RoleEntity {
    @Id
    //设置该表对应列的属性
    @Column(length = 32)
    //自定义uuid
    @GenericGenerator(name = "ruuid", strategy = "uuid")
    //设置id的生成策略,自定义的uuid
    @GeneratedValue(generator = "ruuid")
    private String roleId;
    //insertable = false表示该属性在添加的时候不加入(不常用)
    @Column(name="f_name",length = 48)
    // @Transient//暂态属性,表示不与数据库进行映射的属性
    private String name;

    @Column(columnDefinition = "TIMESTAMP")
    private String addDate;

    @OneToMany(mappedBy = "role")
    private Set<User_RoleEntity> urSet;

    public Set<User_RoleEntity> getUrSet() {
        return urSet;
    }

    public void setUrSet(Set<User_RoleEntity> urSet) {
        this.urSet = urSet;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }
}
