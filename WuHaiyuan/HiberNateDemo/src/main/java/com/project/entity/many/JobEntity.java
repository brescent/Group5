package com.project.entity.many;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "t_job")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    private String jobName;
    @ManyToMany(mappedBy = "jobList")
    private List<PlayerEneity> playerList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public List<PlayerEneity> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<PlayerEneity> playerList) {
        this.playerList = playerList;
    }
}
