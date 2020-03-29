package com.project.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name =  "t_teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String teaName;

    @ManyToMany(mappedBy = "teacherEntitySet")
    private Set<StudentEntity> stuSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setStuName(String teaName) {
        this.teaName = teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Set<StudentEntity> getStuSet() {
        return stuSet;
    }

    public void setStuSet(Set<StudentEntity> stuSet) {
        this.stuSet = stuSet;
    }
}

