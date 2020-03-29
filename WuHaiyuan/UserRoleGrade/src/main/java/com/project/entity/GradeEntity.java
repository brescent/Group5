package com.project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 权限实体
 */
@Entity
@Table(name = "t_grade")
public class GradeEntity implements Serializable {

    /**
     * 权限id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_id")
    private int gradeId;

    /**
     * 权限名
     */
    @Column(name = "f_name", length = 16)
    private String gradeName;

    /**
     * 权限资源
     */
    @Column(name = "f_resource", length = 32)
    private String gradeResource;

    /**
     * 权限说明
     */
    @Column(name = "f_info", length = 32)
    private String gradeInfo;

    /**
     * 权限对应角色集合
     */
  @OneToMany(mappedBy = "grade",fetch = FetchType.EAGER)

    private List<RoleGradeEntity> roleGradeList;

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


    public String getGradeResource() {
        return gradeResource;
    }

    public void setGradeResource(String gradeResource) {
        this.gradeResource = gradeResource;
    }

    public String getGradeInfo() {
        return gradeInfo;
    }

    public void setGradeInfo(String gradeInfo) {
        this.gradeInfo = gradeInfo;
    }

    public List<RoleGradeEntity> getRoleGradeList() {
        return roleGradeList;
    }

    public void setRoleGradeList(List<RoleGradeEntity> roleGradeList) {
        this.roleGradeList = roleGradeList;
    }
}
