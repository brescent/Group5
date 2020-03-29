package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="t_student")
public class StudentEntity {
@Id
//设置列属性
@Column(length = 32)
//自定义策略  定义uuid
@GenericGenerator(name="ruuid",strategy = "uuid")
//getid一个自定义的策略
@GeneratedValue(generator = "ruuid")
private String s_id;
    @Column(length = 48)
private String name;
    @ManyToOne
    @JoinColumn(name = "fk_tid")
    private TeacherEnyity teacher;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeacherEnyity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEnyity teacher) {
        this.teacher = teacher;
    }
}
