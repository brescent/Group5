package com.project.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class RoleEntity {


    @Id
//    //设置该表对应列的属性
//    @Column(length = 32)
//    //自定义uuid
//    @GenericGenerator(name = "ruuid", strategy = "uuid")
//    //设置id的生成策略,自定义的uuid
//    @GeneratedValue(generator = "ruuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
//    //insertable = false表示该属性在添加的时候不加入(不常用)
//    @Column(name = "f_name", length = 48)
    // @Transient//暂态属性,表示不与数据库进行映射的属性

    private String roleName;

    private String roleInfo;

    private String roleType;
    @ManyToOne
    @JoinColumn(name = "fk_userId")
    private UserEntity user;

    @OneToMany(mappedBy = "role")
    private Set<GradeEntity> grade;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<GradeEntity> getGrade() {
        return grade;
    }

    public void setGrade(Set<GradeEntity> grade) {
        this.grade = grade;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
