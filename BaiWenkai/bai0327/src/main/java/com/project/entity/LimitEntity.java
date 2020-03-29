package com.project.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * 权限实体类
 */
@Entity
@Table(name = "sys_limit")
public class LimitEntity {
    @Id
    @Column(name = "l_id", length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "l_name",length = 80)
    private String limitName;
    @Column(name = "l_url",length = 80)
    private String limitURL;
    @Column(name = "l_info",length = 240)
    private String limitInfo;
    @OneToMany(mappedBy = "limit")
    private Set<RoleLimitEntity> roleLimitSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLimitName() {
        return limitName;
    }

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    public String getLimitURL() {
        return limitURL;
    }

    public void setLimitURL(String limitURL) {
        this.limitURL = limitURL;
    }

    public String getLimitInfo() {
        return limitInfo;
    }

    public void setLimitInfo(String limitInfo) {
        this.limitInfo = limitInfo;
    }

    public Set<RoleLimitEntity> getRoleLimitSet() {
        return roleLimitSet;
    }

    public void setRoleLimitSet(Set<RoleLimitEntity> roleLimitSet) {
        this.roleLimitSet = roleLimitSet;
    }
}
