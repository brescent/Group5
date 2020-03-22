package com.project.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String stuName;

    @ManyToMany
    @JoinTable(name = "t_teaStu",joinColumns = {@JoinColumn(name = "pk_stuId")}
    ,inverseJoinColumns = {@JoinColumn(name = "pk_teaId")})
    private Set<TeacherEntity> teacherEntitySet;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Set<TeacherEntity> getTeacherEntitySet() {
        return teacherEntitySet;
    }

    public void setTeacherEntitySet(Set<TeacherEntity> teacherEntitySet) {
        this.teacherEntitySet = teacherEntitySet;
    }
}
