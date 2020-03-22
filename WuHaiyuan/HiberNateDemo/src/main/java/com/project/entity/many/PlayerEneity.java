package com.project.entity.many;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "t_player")
public class PlayerEneity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @ManyToMany()
    @JoinTable(name = "t_player_job",
            joinColumns = {@JoinColumn(name = "fk_playerId")},
            inverseJoinColumns = {@JoinColumn(name = "fk_jobId")})
    private List<JobEntity> jobList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobEntity> getJobList() {
        return jobList;
    }

    public void setJobList(List<JobEntity> jobList) {
        this.jobList = jobList;
    }
}
