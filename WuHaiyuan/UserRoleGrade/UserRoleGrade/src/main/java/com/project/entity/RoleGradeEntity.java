package com.project.entity;

import javax.persistence.*;

/**
 * 角色-权限 实体
 */
@Entity
@Table(name = "t_role_grade")
public class RoleGradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_id")
    private int id;
    /**
     * 角色实体
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_roleId")
    private RoleEntity role;
    /**
     * 权限实体
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_gradeId")
    private GradeEntity grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public GradeEntity getGrade() {
        return grade;
    }

    public void setGrade(GradeEntity grade) {
        this.grade = grade;
    }
}
