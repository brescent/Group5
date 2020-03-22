package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 权限实体类
 */
@Entity
@Table(name = "t_grade")
public class GradeEntity {
    @Id
//    //设置该表对应列的属性
//    @Column(length = 32)
//    //自定义uuid
//    @GenericGenerator(name = "ruuid", strategy = "uuid")
//    //设置id的生成策略,自定义的uuid
//    @GeneratedValue(generator = "ruuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gradeId;

    private String gradeName;

    private String gradeResouce;

    private String gradeType;
    @ManyToOne
    @JoinColumn(name = "fk_roleId")
    private RoleEntity role;

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeResouce() {
        return gradeResouce;
    }

    public void setGradeResouce(String gradeResouce) {
        this.gradeResouce = gradeResouce;
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType;
    }
}
