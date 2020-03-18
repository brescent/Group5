package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_tracher")
public class TeacherEntity {
    @Id
    @Column(name = "pk_id",length = 32)
    @GenericGenerator(name = "tuuid",strategy = "uuid")
    @GeneratedValue(generator = "tuuid")
    private String id;

    private String name;

    private String className;
    @OneToMany(mappedBy = "teacher"/*交付映射权*/)
    private Set<StudentEntity> setStu;

    public Set<StudentEntity> getSetStu() {
        return setStu;
    }

    public void setSetStu(Set<StudentEntity> setStu) {
        this.setStu = setStu;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
