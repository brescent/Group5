package com.project.entity;

import javax.persistence.*;

/**
 * 角色权限中间实体类
 */
@Entity
@Table(name = "m_role_limit")
public class RoleLimitEntity {
    @Id
    @Column(name = "rl_id", length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fk_rid")
    private RoleEntity role;
    @ManyToOne
    @JoinColumn(name = "fk_lid")
    private LimitEntity limit;
}
