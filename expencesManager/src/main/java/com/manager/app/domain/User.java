package com.manager.app.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private List<Earning> earningList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private List<Expence> expenceList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Earning> getEarningList() {
        return earningList;
    }

    public void setEarningList(List<Earning> earningList) {
        this.earningList = earningList;
    }

    public List<Expence> getExpenceList() {
        return expenceList;
    }

    public void setExpenceList(List<Expence> expenceList) {
        this.expenceList = expenceList;
    }
}
