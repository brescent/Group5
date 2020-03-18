package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_student")
public class StudentEntity {
    @Id
    @Column(name ="pk_id" , length = 32)
    @GenericGenerator(name = "suuid" ,strategy = "uuid")
    @GeneratedValue(generator = "suuid")
    private String id;

    private String name;
    @ManyToOne(fetch =FetchType.LAZY/*抓取策略*/,cascade = CascadeType.ALL/*级联操作*/)
    @JoinColumn(name = "fk_tid")
    private TeacherEntity teacher;

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
