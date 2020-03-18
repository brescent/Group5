package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="t_teacher")
public class TeacherEnyity {
    @Id
//设置列属性
    @Column(length = 32)
//自定义策略  定义uuid
    @GenericGenerator(name="ruuid",strategy = "uuid")
//getid一个自定义的策略
    @GeneratedValue(generator = "ruuid")
    private String t_id;

    @Column(length = 48)
    private String name;
    @Column(length = 48)
private String className;
    //把 映射权交给多的一方 mappedBy ="" 多的一方持有控制权
@OneToMany(mappedBy = "teacher")


    private Set<StudentEntity>  setStu;


}
